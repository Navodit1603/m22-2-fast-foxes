package com.example.sping_portfolio.controllers.caleb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Calebfrq2math{
    @GetMapping("/caleb3")
    public String calebfrq1(
            @RequestParam(name = "a", required = false, defaultValue = "0") double a,
            @RequestParam(name = "b", required = false, defaultValue = "0") double b,
            Model model
    ) {
        double answer = Math.sqrt(a * a + b * b);
        model.addAttribute("answer", answer);







        return "caleb3";
    }
}