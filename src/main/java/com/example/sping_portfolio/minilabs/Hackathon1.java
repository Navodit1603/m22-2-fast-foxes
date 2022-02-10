package com.example.sping_portfolio.minilabs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hackathon1 {
    @GetMapping("/draw")
    public String hackathon1(){
      return "hackathon1";
    }
}
