package com.youmeek.ssh.controller;

import com.youmeek.ssh.domain.SysUser;
import com.youmeek.ssh.service.UserServiceI;
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
import java.util.UUID;

/**
 * @author Judas.n 2014年4月6日 22:48:22
 */
@Controller
@RequestMapping("/")
public class UserController {
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	/**
	 * 查询用户
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getUser", method = RequestMethod.GET)
	public @ResponseBody SysUser
	getUser(String id, HttpServletRequest request) {
		SysUser sysUser = userService.getUser(Integer.parseInt(id));
		return sysUser;
	}

	/**
	 * 增加用户
	 * @param name
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveUser(String name, HttpServletRequest request) {
		SysUser sysUser = new SysUser();
		sysUser.setName(name);
		userService.saveUser(sysUser);
		request.setAttribute("sysUser", sysUser);
		request.setAttribute("msg", "添加成功");
		return "result";
	}

	/**
	 * 注册
	 * @param adduser
	 * @param request
     * @return
     */
	@RequestMapping(value = "signup",method = RequestMethod.POST)
	public String signup(SysUser adduser,HttpServletRequest request){
		SysUser add=new SysUser();
		add.setId(adduser.getId());
		add.setUsername(adduser.getUsername());
		add.setPassword(md5(adduser.getPassword()));
		add.setDepartcategory(adduser.getDepartcategory());
		add.setDepartment(adduser.getDepartment());
		int Department=add.getDepartment();
		if(Department==1){
			add.setLevel(1);
		}else{
			add.setLevel(2);
		}
		userService.saveUser(add);
		request.setAttribute("msgtitle", "注册成功");
		request.setAttribute("msg", "注册成功,请点击右上方登录按钮");
		return "result";
	}

	/**
	 * 登录
	 * @param user
	 * @param request
	 * @param attr
	 * @param httpSession
     * @return
     */
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String login(SysUser user,HttpServletRequest request,final RedirectAttributes attr,HttpSession httpSession){
		String username=user.getUsername();
		String password=user.getPassword();
		SysUser getuser=userService.getUserByName(username);
		if(getuser.getUsername()!=null){
			if(getuser.getPassword().equals(md5(password))){
				attr.addAttribute("id",Integer.toString(getuser.getId()));
				httpSession.setAttribute("userid",Integer.toString(getuser.getId()));
				return "redirect:/main.do";
			}else{
				request.setAttribute("msgtitle", "登录失败");
				request.setAttribute("msg", "密码不正确");
				return "result";
			}
		}else {
			request.setAttribute("msgtitle", "登录失败");
			request.setAttribute("msg", "用户名不存在");
			return "result";
		}
	}

	/**
	 * 个人主页
	 * @param id
	 * @param request
	 * @param httpSession
     * @return
     */
	@RequestMapping(value = "main",method = RequestMethod.GET)
	public String main(String id,HttpServletRequest request,HttpSession httpSession){
		if(httpSession.getAttribute("userid")!=null){
			SysUser sysUser = userService.getUser(Integer.parseInt(id));
			request.setAttribute("user",sysUser);
			return "main";
		}else{
			request.setAttribute("msgtitle", "访问失败");
			request.setAttribute("msg", "连接超时，请重新登录");
			return "result";
		}

	}

	/**
	 * 登出模块
	 * @param request
	 * @param httpSession
     * @return
     */
	@RequestMapping(value = "logout")
	public String logout(HttpServletRequest request,HttpSession httpSession){
		if(httpSession.getAttribute("userid")!=null){
			httpSession.removeAttribute("userid");
			request.setAttribute("msgtitle", "成功登出");
			request.setAttribute("msg", "重新登录请到右上角");
		}else {
			request.setAttribute("msgtitle", "成功登出");
			request.setAttribute("msg", "重新登录请到右上角");
		}

		return "result";
	}


	/**
	 * md5加密
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
