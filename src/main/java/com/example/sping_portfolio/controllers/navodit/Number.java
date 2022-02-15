package com.example.sping_portfolio.controllers.navodit;
import java.util.ArrayList;
import java.util.Random;

public class Number {

    int sq = 10;


    public int[] MakeArray(){
        int[] array = new int[sq];
        int i = 0;
        while (sq>0){
            Random random = new Random();
            int number = random.nextInt(33) + 3;
            array[i] = number;
        }
        return array;
    }

    public Sort(int[] list){
       int n = list.length;

    }


    public static void main(){

    }

}
