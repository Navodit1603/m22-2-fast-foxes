package com.example.sping_portfolio.controllers.caleb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calebfrq4streak{
    @GetMapping("/caleb4")
    public String calebfrq4(
            @RequestParam(name = "segment", required = false, defaultValue="CALLLLLEEB") String segment,
            Model model
    ) {
                int longStreak = 1;
                char longChar = ' ';
                int currentStreak = 1;
                char currentChar = ' ';

                for (int i = 1; i < segment.length(); i++){
                    if(segment.charAt(i) == segment.charAt(i-1)) {
                        currentChar = segment.charAt(0);
                        currentStreak++;
                        currentChar = segment.charAt(i);


                        if (currentStreak > longStreak) {
                            longStreak = currentStreak;
                            longChar = currentChar;



                        }
                    }
                }
        segment = "Streak is " + longStreak + " and Character is " + longChar;
        model.addAttribute("segment", segment);
        return "caleb4";
             }
        }
