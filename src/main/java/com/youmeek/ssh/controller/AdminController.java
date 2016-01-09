package com.youmeek.ssh.controller;

import com.youmeek.ssh.domain.Departcate;
import com.youmeek.ssh.domain.Message;
import com.youmeek.ssh.domain.News;
import com.youmeek.ssh.domain.SysUser;
import com.youmeek.ssh.other.add_book;
import com.youmeek.ssh.other.book_user;
import com.youmeek.ssh.other.data;
import com.youmeek.ssh.other.messsu;
import com.youmeek.ssh.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Time;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

/**
 * Created by liumeng on 2016/1/8.
 */
@Controller
@RequestMapping("/user/")
public class AdminController {
    @Autowired
    private UserServiceI userService;
    @Autowired
    private DepartServiceI departService;
    @Autowired
    private DepartcateServiceI departcateService;
    @Autowired
    private MessageServiceI messageService;
    @Autowired
    private NewsServiceI newsService;

    /**
     * 通讯录
     *
     * @param request
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "address_book", method = RequestMethod.GET)
    public String address_book(String messid, HttpServletRequest request, HttpSession httpSession) {
        List<add_book> aball = new ArrayList<add_book>();
        List<Departcate> delist = departcateService.getAllDepartcate();
        List<SysUser> su = userService.getAllUser();
        for (int i = 0; i < delist.size(); i++) {
            add_book ab = new add_book();
            int decaid = delist.get(i).getId();
            ab.setId(decaid);
            ab.setName(delist.get(i).getName());
            for (int j = 0; j < su.size(); j++) {
                if (su.get(j).getDepartcategory() == decaid) {
                    book_user bu = new book_user();
                    bu.setId(su.get(j).getId());
                    bu.setName(su.get(j).getName());
                    ab.setBu(bu);
                }
            }
            aball.add(ab);
        }

        if (messid != null && !messid.equals("")) {
            Message mes = messageService.getMessage(Integer.parseInt(messid));
            mes.setCheckd(1);
            messageService.updateMessage(mes);
            messsu mess = new messsu();
            mess.setContent(mes.getContent());
            mess.setFromid(mes.getFromid());
            mess.setMessid(mes.getId());
            mess.setTime(mes.getTime());
            mess.setDate(mes.getDate());
            mess.setFromname(userService.getUser(mes.getFromid()).getName());
            request.setAttribute("mess", mess);
        }
        request.setAttribute("msguser", aball);
        return "/user/address-book";
    }

    /**
     * 发送消息
     *
     * @param mess
     * @param request
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "send_mess", method = RequestMethod.POST)
    public
    @ResponseBody
    data send_mess(Message mess, HttpServletRequest request, HttpSession httpSession) {
        Message mes = new Message();
        Date now = new Date(System.currentTimeMillis());
        Time time = new Time(System.currentTimeMillis());
        String cid = (String) httpSession.getAttribute("userid");
        mes.setFromid(Integer.parseInt(cid));
        mes.setToid(mess.getToid());
        mes.setContent(mess.getContent());
        mes.setDate(now);
        mes.setTime(time);
        mes.setCheckd(0);
        messageService.saveMessage(mes);
        data d = new data();
        d.setRemsg("sucess");
        return d;
    }

    /**
     * 发送消息
     *
     * @param request
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "view_mess")
    public String view_mess(HttpServletRequest request, HttpSession httpSession) {
        String cid = (String) httpSession.getAttribute("userid");
        List<Message> mess = messageService.getMessageByTo(Integer.parseInt(cid));
        List<messsu> me = new ArrayList<messsu>();
        for (int i = 0; i < mess.size(); i++) {
            messsu m = new messsu();
            m.setMessid(mess.get(i).getId());
            m.setFromid(mess.get(i).getFromid());
            String name = userService.getUser(mess.get(i).getFromid()).getName();
            m.setFromname(name);
            m.setDate(mess.get(i).getDate());
            m.setTime(mess.get(i).getTime());
            m.setCheck(mess.get(i).getCheckd());
            m.setContent(mess.get(i).getContent());
            me.add(m);
        }
        request.setAttribute("meslist", me);
        return "/user/message";
    }

    /**
     * 纂写公告
     *
     * @param news
     * @param request
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "add_news", method = RequestMethod.POST)
    public
    @ResponseBody
    data add_news(News news, HttpServletRequest request, HttpSession httpSession) {
        String cid = (String) httpSession.getAttribute("userid");
        int decaid = (Integer) httpSession.getAttribute("departcateid");
        Date now = new Date(System.currentTimeMillis());
        Time time = new Time(System.currentTimeMillis());
        News n = new News();
        n.setFromid(Integer.parseInt(cid));
        n.setCheckd(0);
        n.setDate(now);
        n.setTime(time);
        n.setContent(news.getContent());
        n.setTitle(news.getTitle());
        n.setToid(decaid);
        newsService.saveNews(n);
        data d = new data();
        d.setRemsg("成功添加");
        return d;
    }

    /**
     * 查看公告
     *
     * @param id
     * @param request
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "somenews", method = RequestMethod.GET)
    public String somenews(String id, HttpServletRequest request, HttpSession httpSession) {
        if (id != null) {
            News n = newsService.getNews(Integer.parseInt(id));
            n.setCheckd(1);
            newsService.updateNews(n);
            request.setAttribute("n", n);

        } else {
            List<News> ns = new ArrayList<News>();
            int decaid = (Integer) httpSession.getAttribute("departcateid");
            ns = newsService.getNewsByTo(decaid);
            request.setAttribute("ns", ns);
        }
        return "/user/news";

    }

    /**
     * 修改个人资料
     *
     * @param user
     * @param request
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "updateuser", method = RequestMethod.POST)
    public
    @ResponseBody
    data updateuser(SysUser user, HttpServletRequest request, HttpSession httpSession) {
        data d = new data();
        if (user != null) {
            String cid = (String) httpSession.getAttribute("userid");
            SysUser nuser = userService.getUser(Integer.parseInt(cid));
            nuser.setPassword(md5(user.getPassword()));
            nuser.setName(user.getName());
            nuser.setEmail(user.getEmail());
            nuser.setPhone(user.getPhone());
            userService.updateUser(nuser);
            d.setRemsg("修改成功");
        } else {
            d.setRemsg("修改失败");
        }
        return d;
    }

    @RequestMapping(value = "index")
    public String index(HttpServletRequest request, HttpSession httpSession) {
        String cid = (String) httpSession.getAttribute("userid");
        SysUser nuser = userService.getUser(Integer.parseInt(cid));
        request.setAttribute("user", nuser);
        return "/user/index";
    }

    /**
     * md5加密
     *
     * @param plainText
     * @return
     */
    public String md5(String plainText) {
        String re_md5 = new String();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }

            re_md5 = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return re_md5;
    }
}
