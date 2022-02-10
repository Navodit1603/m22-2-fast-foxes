package com.example.sping_portfolio.controllers.navodit.Book;

public class Book {

    public String title;
    public String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }



    public String printBookInfo()
    {
       String info = title + ", written by " + author;

       return info;
    }
}
