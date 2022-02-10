package com.example.sping_portfolio.controllers.navodit.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @GetMapping("navodit/frq8")
    public String book(
            @RequestParam(name = "book", defaultValue = "") String book,
            @RequestParam(name = "author", defaultValue = "") String author,
            @RequestParam(name = "ill", required = false, defaultValue = "") String ill,
            Model model){

        Book b;
        if(ill.equals("")){
             b = new Book(book, author);
        }
        else{
             b = new Picture(book, author, ill);
        }

        String info = b.printBookInfo();

        model.addAttribute("info", info);



        return "navodit/frq8";
    }
}
