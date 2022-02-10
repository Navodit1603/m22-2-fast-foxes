package com.example.sping_portfolio.controllers.caleb;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calebfrq3rsvp {
    @GetMapping("/caleb2")
    public String Calebfrq2(
            @RequestParam(name = "rsvp", required = false, defaultValue = "true") boolean rsvp,
            @RequestParam(name = "selection", required = false, defaultValue = "0") int selection,
            @RequestParam(name = "option1", required = false, defaultValue = "") String option1,
            Model model
    ) {
        if (rsvp) {
            if (selection == 1) {
                option1 = "BEEF";
            } else if (selection == 2) {
                option1 = "CHICKEN";
            } else if (selection == 3) {
                option1 = "PASTA";
            } else {
                option1 = "FISH";
            }
        } else {
            option1 = "SORRY";
        }

        model.addAttribute("option1", option1);

        return "caleb2";
    }

}
