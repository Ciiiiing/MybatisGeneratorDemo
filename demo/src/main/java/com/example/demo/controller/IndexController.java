package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    TestService testService;

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("tests", testService.getTest("1"));
        return "index";
    }
}
