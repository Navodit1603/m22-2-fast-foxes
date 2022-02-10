package com.example.sping_portfolio.controllers.grace;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class LoginController implements WebMvcConfigurer {


    @GetMapping("/controllers/grace")
    public String login(Model model) {
        model.addAttribute("message", "Hello World");
        return "/login/login";
    }
}
