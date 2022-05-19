package com.sprig.mvc.firstapp.controller;


import com.sprig.mvc.firstapp.entity.Database;
import com.sprig.mvc.firstapp.service.DatabaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("")
public class MainController {
    
    @Autowired 
    private DatabaseServices databaseService;

    @GetMapping
    private String welcome(Model model) {

        String title = "welcome to spring framework";
        model.addAttribute("title", title);
        model.addAttribute("datas", databaseService.findAll());
        return "index";
    }

    @GetMapping("/addData")
    private String addPage(Model model){
        String title = "add Data";
        model.addAttribute("title",title);
        model.addAttribute("datas", new Database());
        return "addData";
    }

    @PostMapping("/save")
    private String save(Database database,Model model){
        databaseService.save(database);
        return "redirect:/";
    }

    @GetMapping(value="/profile")
    public String profile(Model model) {
        String title = "Profile";
        model.addAttribute("title",title);
        return "profile";
    }

    @GetMapping(value = "/delete/{id}")
    private String delete(@PathVariable("id") long id){
        // System.out.println(id);
        databaseService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    private String editData(@PathVariable("id") long id ,Model model){
        String title = "edit";
        model.addAttribute("title", title);
        model.addAttribute("datas", databaseService.findById(id));
        return "edit";
    }

    @PostMapping(value="/update")
    public String update(Database database, Model model) {
        databaseService.Update(database);
        return "redirect:/";
    }
    
    
}
