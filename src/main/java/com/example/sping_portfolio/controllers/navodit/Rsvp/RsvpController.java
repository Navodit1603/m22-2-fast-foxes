package com.example.sping_portfolio.controllers.navodit.Rsvp;

import com.example.sping_portfolio.controllers.navodit.Rsvp.Rsvp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RsvpController {
    @GetMapping("navodit/frq2")
    public String rsvp(
            @RequestParam(name = "meal", required = false, defaultValue = "0") int num,
            @RequestParam(name="attend", required = false, defaultValue = "0") boolean attend,
            Model model){
       Rsvp r = new Rsvp(attend, num);
       String dinner = r.dinner();
       model.addAttribute("r",r);
       model.addAttribute("dinner", dinner);

       return "navodit/frq2";
    }
}
