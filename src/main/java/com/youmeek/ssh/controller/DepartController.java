package com.youmeek.ssh.controller;

import com.youmeek.ssh.domain.Depart;
import com.youmeek.ssh.service.DepartServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by liumeng on 2016/1/6.
 */
@Controller
@RequestMapping("/")
public class DepartController {
    @Autowired
    public DepartServiceI departServiceI;

    // public DepartServiceI getDepartServiceI(){return departServiceI};
}
