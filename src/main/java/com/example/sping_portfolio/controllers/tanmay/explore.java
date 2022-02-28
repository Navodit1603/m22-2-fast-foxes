package com.example.sping_portfolio.controllers.tanmay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class explore {
    @GetMapping("/explore")
    public String GameExplore(Model model) {
        return "explore";
    }
}
