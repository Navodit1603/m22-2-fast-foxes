package com.example.sping_portfolio.controllers;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Write a Class Number
public class Number {
    public static int getRandomValue(int Min, int Max)
    {

        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1);
    }

    // Driver code
    public static void main(String[] args)
    {

        int Min = 3, Max = 36;

        System.out.println("Random value between "
                + Min + " and " + Max + ": "
                + getRandomValue(Min, Max));
    }



}
