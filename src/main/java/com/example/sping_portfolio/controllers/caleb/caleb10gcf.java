package com.example.sping_portfolio.controllers.caleb;

import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import java.beans.DesignMode;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.Random;
import java.util.ArrayList;


class NumberSystem {

    public static int gcf(int a, int b) {
        if (a % b == 0)
            return b;
        return gcf(b, a % b);
    }

    public static String reduceFraction(int numerator, int denominator) {
        if (numerator % denominator == 0)
            return String.valueOf(numerator / denominator);
        int gcf_ = gcf(numerator, denominator);
        numerator /= gcf_;
        denominator /= gcf_;

        return (numerator + "/" + denominator);
    }

}

public class caleb10gcf {
    @GetMapping("/caleb10")
    public String caleb10(
            @RequestParam(name = "numerator", required = false, defaultValue = "8") int numerator,
            @RequestParam(name = "denominator", required = false, defaultValue = "12") int denominator,
            Model model
    ) {
        NumberSystem nS = new NumberSystem();
        model.addAttribute("reducedFraction", nS.reduceFraction(numerator, denominator));

        return "caleb10";
    }
}
