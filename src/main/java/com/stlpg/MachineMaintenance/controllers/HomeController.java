package com.stlpg.MachineMaintenance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

//    @Autowired
//    @GetMapping
//    public String displayIndexForm(Model model){
//        model.addAttribute("title", "Index");
//        return "index";
//    }

    @GetMapping
    public String displayIndexForm(){
        return "index";
    }

    @GetMapping("/login")
    public String displayLoginForm(){
        return "login";
    }

    @GetMapping("/user")
    public String displayUserForm(){
        return "user";
    }

    @GetMapping("/machine")
    public String displayMachineForm(){
        return "machine";
    }
}
