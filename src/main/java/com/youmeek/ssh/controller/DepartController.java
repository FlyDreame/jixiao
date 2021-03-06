package com.youmeek.ssh.controller;

import com.youmeek.ssh.domain.Depart;
import com.youmeek.ssh.service.DepartServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liumeng on 2016/1/6.
 */
@Controller
@RequestMapping("/")
public class DepartController {
    @Autowired
    private DepartServiceI departService;

    @RequestMapping(value = "getDepart", method = RequestMethod.GET)
    public String getDepart(String id, HttpServletRequest request) {
        Depart de = departService.getDepart(Integer.parseInt(id));
        request.setAttribute("msgtitle", "查询成功");
        request.setAttribute("msg", de.getName());
        return "result";
    }

    // public DepartServiceI getDepartServiceI(){return departServiceI};
}
