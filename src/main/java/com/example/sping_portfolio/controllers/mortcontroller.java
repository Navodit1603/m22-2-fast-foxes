package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mortcontroller {
    @GetMapping("/mort")
    public String mort() {
        return "IHATEMORT";
    }
}
