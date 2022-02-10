package com.example.sping_portfolio.controllers.navodit.Username;

import java.util.Random;

public class Username {


    public static String[] Generate(String fName, String lName){
        String [] list = new String [lName.length()+1];
        Random random = new Random();
        for(int i = 0; i < lName.length(); i++){
            int number = random.nextInt(100);
            String username = fName + lName.substring(0,i+1) + number;
            System.out.println(fName + lName.substring(0,i+1) + number);
            list[i] = username;
        }
        return list;
    }

}
