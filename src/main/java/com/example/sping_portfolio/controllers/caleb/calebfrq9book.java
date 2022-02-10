package com.example.sping_portfolio.controllers.caleb;

import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;

class BookListing {

    private Book book;
    private double price;

    public BookListing(Book book, double price) {
        this.book = book;
        this.price = price;
    }

    public String printDescription() {
        return (book.printBookInfo() + ", " + price);
    };

}

class PictureBook extends Book {

    private String illustrator;

    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }

    public String printBookInfo() {
        return (super.title + ", written by " + super.author + ", illustrated by " + illustrator);
    }
}

class Book {

    public String title;
    public String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String printBookInfo() {
        return (title + ", written by " + author);
    }

}

@Controller
public class calebfrq9book {
    @GetMapping("/caleb9")
    public String caleb9(

            Model model
    ) {

        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
        model.addAttribute("book1", book1.printBookInfo());
        model.addAttribute("book2", book2.printBookInfo());


        return "caleb9";
    }
}
