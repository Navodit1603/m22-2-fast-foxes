package com.example.sping_portfolio.controllers;

public class Average {

    public float FindAvg(int ratings[]){

        float sum = 0;

        //compute sum
        for(int num:ratings)
            sum += num;

        //compute average
        float average = (sum / ratings.length);

        System.out.println("Average : "+average);
        return average;
    }

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4, 5, 6};
        Average avg = new Average();
        avg.FindAvg(nums);
    }


}
