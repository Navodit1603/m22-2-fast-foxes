package com.example.sping_portfolio.controllers.navodit.GCF;

public class NumberSystem {


    public static int Gcf(int a, int b){
        if(a < b){
            // Swap for larger number to come first
            int temp = a;
            a = b;
            b = temp;
        }

        // Base Case
        if(b == 0){
            return a;
        }

        int gcf = Gcf(b, a % b);
        return gcf;
    }

    public static String Simplify(int a, int b, int gcf){
        if(a < b){
            // Swap for larger number to come first
            int temp = a;
            a = b;
            b = temp;
        }

        int num = a/gcf;
        int den = b/gcf;

        String simplified = num+"/"+den;

        return simplified;
    }

}
