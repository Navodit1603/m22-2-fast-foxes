package com.example.sping_portfolio.controllers.navodit.Ending;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EndingController {
    @GetMapping("navodit/frq6")
    public String frq6(@RequestParam(name = "word1", required = false, defaultValue = "0") String word_1,
                       @RequestParam(name = "word2", required = false, defaultValue = "0") String word2,
                       @RequestParam(name = "word3", required = false, defaultValue = "0") String word3,
                       @RequestParam(name = "word4", required = false, defaultValue = "0") String word4,
                       @RequestParam(name = "word5", required = false, defaultValue = "0") String word5,
                       @RequestParam(name = "word6", required = false, defaultValue = "0") String word6,
                        Model model){

        String x[] ={word_1, word2,word3,word4,word5,word6};

        Ending e = new Ending(x);
        String []sorted = e.Ing();
        model.addAttribute("sorted", sorted);


        return "navodit/frq6";
    }
}
