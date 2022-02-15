package com.example.sping_portfolio.controllers.navodit;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Number {

    int sq;

    public Number(int squirrels){
        sq = squirrels;
    }


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

    public int[] Sort(int[] list){
        int n = list.length;
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(list[j] < list[min])
                    min = j;
            }

            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }

        return list;

    }


    public static void main(){
        Number num = new Number(10);
        int[] arr = num.MakeArray();
        //int[] sorted = arr.Sort();

    }

}
