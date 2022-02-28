package com.example.sping_portfolio.controllers.tanmay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tanmay {
    @GetMapping("/tanmay")
    public String AboutTanmay(Model model) {
        model.addAttribute("person", "Tanmay");
        return "tanmay";
    }

}
