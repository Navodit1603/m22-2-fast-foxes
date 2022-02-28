package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Top {
    @GetMapping("/top")
    public String top(Model model){
        return "top";
    }
}