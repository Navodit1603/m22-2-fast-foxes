package com.example.sping_portfolio.controllers.grace;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Controller
public class Grace {
    @GetMapping("/grace")
    public String grace(Model model) throws IOException, InterruptedException, ParseException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://trivia-by-api-ninjas.p.rapidapi.com/v1/trivia?category=sportsleisure&limit=30"))
                .header("x-rapidapi-host", "trivia-by-api-ninjas.p.rapidapi.com")
                .header("x-rapidapi-key", "215a0875bcmsh7b230e4f9ab5a5dp1b2cf9jsn0b45c55a9a92")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Object object = new JSONParser().parse(response.body());
        JSONArray trivia = (JSONArray) object;

        model.addAttribute("trivia", trivia);

        //model.addAttribute("trivia", trivia);
        {return "grace";}
    }

}


