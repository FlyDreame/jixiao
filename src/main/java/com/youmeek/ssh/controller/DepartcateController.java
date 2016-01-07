package com.youmeek.ssh.controller;

import com.youmeek.ssh.domain.Departcate;
import com.youmeek.ssh.service.DepartcateServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by liumeng on 2016/1/7.
 */
@Controller
@RequestMapping("/")
public class DepartcateController {
    @Autowired
    private DepartcateServiceI departcateService;

    @RequestMapping(value = "getDepartcate", method = RequestMethod.GET)
    public String getDepartcate(String decateid, HttpServletRequest request) {
        Departcate decate = departcateService.getDepartcate(Integer.parseInt(decateid));
        request.setAttribute("msgtitle", "查询成功");
        request.setAttribute("msg", decate.getName());
        return "result";
    }
}
