package com.example.sping_portfolio.controllers.navodit.comment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Comment {

    List<UserComment> l = new ArrayList<>();

    @GetMapping("/comment")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(
            @RequestParam(name = "username", required = false, defaultValue = "First last") String username,
            @RequestParam(name = "comment", required = false, defaultValue = "[your comment here]") String comment,
            Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON

        UserComment uc = new UserComment(username, comment);

        uc.ChangeComment("time");

        l.add(uc);

        model.addAttribute("l", l);

        return "comment"; // returns HTML VIEW (greeting)
    }
}
