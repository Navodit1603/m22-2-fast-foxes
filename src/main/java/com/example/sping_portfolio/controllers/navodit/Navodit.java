package com.example.sping_portfolio.controllers.navodit;

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
public class Navodit {
    @GetMapping("/navodit")
    public String navodit(Model model) throws IOException, InterruptedException, ParseException{

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://trivia-by-api-ninjas.p.rapidapi.com/v1/trivia?category=geography"))
                .header("x-rapidapi-host", "trivia-by-api-ninjas.p.rapidapi.com")
                .header("x-rapidapi-key", "845637a39cmshcd1cb3388e6f02ap15ffd5jsne437b834d421")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Object object = new JSONParser().parse(response.body());
        JSONArray trivia = (JSONArray) object;

        model.addAttribute("trivia", trivia);

        return "navodit/navodit";
    }
}
