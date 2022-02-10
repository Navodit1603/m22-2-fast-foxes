package com.example.sping_portfolio.controllers.caleb;

import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

class Invitation {
    private String hostName = "Caleb";
    private String address;

    public Invitation(String a) {
        address = a;
    }

    public String getHost() {
        return hostName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String invite(String person) {
        return ("Dear " + person + ", please attend my event at " + address + ". See you then, " + hostName + ".");
    }

}

@Controller
public class caleb5{
    @GetMapping("/caleb5")
    public String caleb5(
            @RequestParam(name = "name", required = false, defaultValue = "Caleb") String name,
            @RequestParam(name = "address", required = false, defaultValue = "Sesame Street") String address,
            Model model
            ) {

        Invitation inv = new Invitation(address);
        model.addAttribute("invite", inv.invite(name));

        return "caleb5";
    }
}

