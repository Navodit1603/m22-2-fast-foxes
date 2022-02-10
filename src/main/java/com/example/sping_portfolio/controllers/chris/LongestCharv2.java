package com.example.sping_portfolio.controllers.chris;

public class LongestCharv2 {

    public char prevC = '_';

    public String largest = "";

    public String txt = "";

    public String input;

    public LongestCharv2(String input) {
        this.input = input;
    }

    public String IdentifyChar(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != prevC) {
                txt = "";
            }

            txt += c;

            if (txt.length() > largest.length()) {
                largest = txt;
            }

            prevC = c;
        }

        return(largest.charAt(0) + " which occurs " + largest.length() + " times");
    }
}
