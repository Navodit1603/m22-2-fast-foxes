package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Rate {
    @GetMapping("/rate")
    public String rate(Model model){
        return "rating/rate";
    }
}
