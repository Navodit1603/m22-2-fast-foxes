package com.example.sping_portfolio.controllers.navodit.Pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassController {
    @GetMapping("navodit/frq5")
    public String frq5(){
        System.out.println("Hello world!");

        Pizza myPizza = new Pizza();
        myPizza.setPizaSize(Pizza.Sizes.large);
        myPizza.addToppings(Pizza.ToppingOptions.onion);
        System.out.println(myPizza.toString());

        return "navodit/frq5";
    }
}
