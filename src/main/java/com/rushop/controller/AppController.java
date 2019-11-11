package com.rushop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    // http://localhost:8080/
    @RequestMapping("/")
    public String getHelloPage(Model model) {
        model.addAttribute("name", "Hello world!");
        return "hello";
    }
}
