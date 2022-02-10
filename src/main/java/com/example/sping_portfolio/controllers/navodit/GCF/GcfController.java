package com.example.sping_portfolio.controllers.navodit.GCF;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GcfController {
    @GetMapping("navodit/frq9")
    public String gcf(
            @RequestParam(name = "first", required = false, defaultValue = "1") int first,
            @RequestParam(name = "second", required = false, defaultValue = "1") int second,
            Model model){

        int gcf = NumberSystem.Gcf(first,second);
        String simplified = NumberSystem.Simplify(first, second, gcf);

        model.addAttribute("gcf", gcf);
        model.addAttribute("first", first);
        model.addAttribute("second", second);
        model.addAttribute("simplified", simplified);

        return "navodit/frq9";
    }
}
