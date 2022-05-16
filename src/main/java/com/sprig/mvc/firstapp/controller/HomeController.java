package com.sprig.mvc.firstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    
    @GetMapping
    private String welcome(Model model) {

        String message = "this text return from controller";
        model.addAttribute("message", message);
        return "index";
    }
}
