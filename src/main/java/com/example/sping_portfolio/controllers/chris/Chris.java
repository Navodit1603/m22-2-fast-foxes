package com.example.sping_portfolio.controllers.chris;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class Chris {
    @GetMapping("/chris")
    public String chris(Model model) throws IOException, InterruptedException, ParseException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://trivia-by-api-ninjas.p.rapidapi.com/v1/trivia?category=toysgames"))
                .header("x-rapidapi-host", "trivia-by-api-ninjas.p.rapidapi.com")
                .header("x-rapidapi-key", "1d036507a7mshbe0c2503e976f71p177567jsn4fd37e7de638")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Object object = new JSONParser().parse(response.body());
        JSONArray stats = (JSONArray) object;

        model.addAttribute("stats", stats);

        {return "chris";}
    }

}