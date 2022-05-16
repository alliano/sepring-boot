package com.sprig.mvc.firstapp.controller;

import com.sprig.mvc.firstapp.service.DatabaseServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    
    @Autowired 
    private DatabaseServices productService;

    @GetMapping
    private String welcome(Model model) {

        String title = "welcome to spring framework";
        model.addAttribute("title", title);
        model.addAttribute("datas", productService.findAll());
        return "index";
    }
}
