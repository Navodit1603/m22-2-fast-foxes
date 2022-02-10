package com.example.sping_portfolio.controllers.navodit.Substring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SubstringController {
    @GetMapping("navodit/frq4")
        public String letter(
                @RequestParam(name = "substring", required = false, defaultValue = "CAAATT") String abc,
                Model model){
        ////
        Substring s = new Substring(abc);
        s.recurrence();
        model.addAttribute("ans", s.ans);
        model.addAttribute("x", s.x);







        return "navodit/frq4";
    }
}
