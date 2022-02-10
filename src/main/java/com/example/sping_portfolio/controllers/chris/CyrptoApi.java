//alpha vantage api key: RA4GWKFU88QOAP5M

package com.example.sping_portfolio.controllers.chris;

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
class CryptoApi {
    @GetMapping("/crypto")
    public String chris(Model model) throws IOException, InterruptedException, ParseException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://coinlore-cryptocurrency.p.rapidapi.com/api/tickers/?start=0&limit=100"))
                .header("x-rapidapi-host", "coinlore-cryptocurrency.p.rapidapi.com")
                .header("x-rapidapi-key", "1d036507a7mshbe0c2503e976f71p177567jsn4fd37e7de638")
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

        List<Stock> ls = new ArrayList<>();

        for (int i = 0; i < (stats.size()); i++) {

            // accessing each element of array
            Stock s  = new Stock();
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


        {return "crypto";}
    }

}
