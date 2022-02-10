package com.example.sping_portfolio.controllers.navodit.Book;

public class Picture extends Book{
    public String illustrator;

    public Picture(String t, String a, String i){
        super(t,a);
        illustrator = i;
    }


   public String printBookInfo(){
        String info = super.title + ", written by " + super.author + ", illustrated by "+ illustrator;
        return info;
    }
}
