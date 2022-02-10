package com.example.sping_portfolio.controllers.navodit.Ending;

public class Ending {

    String[] m_words;

    public Ending(String[] words){

        m_words = words;
    }

    public String[] Ing(){
        String[] sorted = new String[m_words.length];
        int count = 0;
        for(String i: m_words){
            if(i.endsWith("ing")){
               sorted[count] = i;
               count++;
            }
        }
        return sorted;
    }


}
