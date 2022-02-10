package com.example.sping_portfolio.controllers.chris;

import com.example.sping_portfolio.controllers.chris.LongestChar;
import com.example.sping_portfolio.controllers.chris.LongestCharv2;
import com.example.sping_portfolio.controllers.chris.UserComment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Frq4 {



    @GetMapping("/frq4")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(
            @RequestParam(name = "strinput", required = false, defaultValue = "aaabb") String strinput, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON

        LongestCharv2 in = new LongestCharv2(strinput);

        String res = in.IdentifyChar(strinput);

        model.addAttribute("intext", strinput); // MODEL is passed to html
        model.addAttribute("result", res); // MODEL is passed to html

        return "frq4"; // returns HTML VIEW (greeting)

        }
    }


