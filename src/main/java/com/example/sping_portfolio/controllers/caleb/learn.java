package com.example.sping_portfolio.controllers.caleb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class learn {
    @GetMapping("/learn")
    public String learn() {
        return "learn"; // returns HTML VIEW (greeting)
    }
}