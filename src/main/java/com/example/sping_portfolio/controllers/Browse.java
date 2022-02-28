package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Browse {
    @GetMapping("/browse")
    public String browse(Model model){
        return "browse";
    }
}