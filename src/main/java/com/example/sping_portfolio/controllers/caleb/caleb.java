package com.example.sping_portfolio.controllers.caleb;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class caleb {
    @GetMapping("/caleb")
    public String caleb(Model model) throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://trivia-by-api-ninjas.p.rapidapi.com/v1/trivia"))
                .header("x-rapidapi-host", "trivia-by-api-ninjas.p.rapidapi.com")
                .header("x-rapidapi-key", "090ee8ea5bmsh4e6155429c44f48p10b6a7jsne4150a8952cb")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Object object = new JSONParser().parse(response.body());
        JSONArray joke = (JSONArray) object;

        model.addAttribute("joke", joke);

        {return "caleb";}
    }
}


