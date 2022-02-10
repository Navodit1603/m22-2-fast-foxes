package com.example.sping_portfolio.controllers.navodit.Username;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsernameController {
    @GetMapping("navodit/frq7")
    public String usernames(
            @RequestParam(name = "first", defaultValue = "") String first,
            @RequestParam(name = "last", defaultValue = "") String last,
            Model model){

        String[] list = Username.Generate(first, last);
        model.addAttribute("list", list);
        return "navodit/frq7";
    }
}
