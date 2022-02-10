package com.example.sping_portfolio.controllers;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Controller
public class Welcome {
    @GetMapping("/welcome")
    public String welcome(Model model){

        return "login/welcome";
    }
}
