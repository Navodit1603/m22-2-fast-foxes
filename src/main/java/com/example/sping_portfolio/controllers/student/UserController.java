package com.example.sping_portfolio.controllers.student;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserJpaRespository userJpaRespository;
    private UserSqlRespository userSqlRespository;

    @GetMapping("/student/reviews")
    public String grace(Model model) {
        List<User> users = userJpaRespository.findAll();
        model.addAttribute("message", "Login Test");
        model.addAttribute("list",users);
        {return "/login/test";}
    }

    @PostMapping("/student/load")
    public String personSave(@Valid User user, Model model, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "database/login";
        }
        userJpaRespository.save(user);
        // Redirect to next step
        //List<User> list = userSqlRepository.listAll();
        //model.addAttribute("list",list);
        return "redirect:/student/login";
    }

    @GetMapping("/student/test")
    public String personAdd(Model model) {
        model.addAttribute("message", "Testing List");
        model.addAttribute("user", new User());
        return "login/login2";
    }


    //public List<User> findAll(){
    //    return userJpaRespository.findAll();
    //}


    @GetMapping(value ="/student/{name}")
    public User findByName(@PathVariable final String name){
        return userJpaRespository.findByName(name);
    }


}


//    @GetMapping("/database/scrum_create")
//    public String scrumTeamCreate(Model model) {
//        model.addAttribute("scrum", new Scrum());
//        model.addAttribute("listPersons", personSqlRepository.listAll());
//        return "database/scrum_form";
//    }

