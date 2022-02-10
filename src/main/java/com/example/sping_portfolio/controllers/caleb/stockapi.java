package com.example.sping_portfolio.controllers.caleb;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
import java.util.ArrayList;
import java.util.List;

@Controller
class stockapi {
    @GetMapping("/stocks")
    public String caleb(Model model) throws IOException, InterruptedException, ParseException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://stock-market-data.p.rapidapi.com/market/index/nikkei-two-twenty-five"))
                .header("x-rapidapi-host", "stock-market-data.p.rapidapi.com")
                .header("x-rapidapi-key", "090ee8ea5bmsh4e6155429c44f48p10b6a7jsne4150a8952cb")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        //Object object = new JSONParser().parse(response.body());
        //JSONArray stats = (JSONArray) object;

        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(response.body());
        JSONArray stats = (JSONArray) json.get("data");

        System.out.println(json.get("data"));

        List<stocklist> ls = new ArrayList<>();

        for (int i = 0; i < (stats.size()); i++) {

            stocklist s = new stocklist();
            JSONObject res = new JSONObject();
            res = (JSONObject)stats.get(i);

            s.id = Integer.parseInt((String) res.get("id"));
            s.symbol = (String) res.get("symbol");
            s.name = (String) res.get("name");
            // String nameid;
            s.rank = (Long) res.get("rank");
            s.price_usd = (String) res.get("price_usd");
            s.percent_change_24h = (String) res.get("percent_change_24h");

            ls.add(s);
        }
        model.addAttribute("ls", ls);


        {return "stocks";}
    }

}
