package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Read {
    @GetMapping("/ratings")
    public String read(Model model){
        return "rating/read";
    }
}
