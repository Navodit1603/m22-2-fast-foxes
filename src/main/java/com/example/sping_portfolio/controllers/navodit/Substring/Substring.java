package com.example.sping_portfolio.controllers.navodit.Substring;

public class Substring {

    String str;
    int ans;
    char x;

    public Substring(String s) {
        str = s;
    }

    public void recurrence(){
        ans = 1;
        int temp = 1;

        char[] ch = new char[str.length()];
         x = ' ';

        for (int i = 1; i < str.length(); i++)
        {

            if (str.charAt(i) == str.charAt(i - 1))
            {
                ++temp;
                if (temp > ans){
                    x= str.charAt(i);
                }

            }
            else
            {

                ans = Math.max(ans, temp);

                temp = 1;
            }
        }
        ans = Math.max(ans, temp);
        System.out.println("");
        System.out.println(ans + "   " + x);
        System.out.println("");
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (char c : ch) {
            System.out.println(c);
        }

    }

}
