package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.services.BookService;
import com.java_24_25.finalProject.services.PageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BookController {

    @Autowired
    PageDataService pageDataService;
    BookService bookService;

    @GetMapping("/create")
    public String showCreateTheBookPage(Model model) {
        model.addAttribute("projectTitle", pageDataService.getProjectTitle());
        model.addAttribute("pageInfo", pageDataService.getPage("createTheBook"));
        System.out.println("The user is creating a book.");

        return "createTheBook";
    }

    @PostMapping("/create")
    public String handleReceiptPage(Book book){
        try {
            bookService.createBook(book);
            return "redirect:yourBook";
        }catch (Exception ex){
            System.out.println(ex);
            return "redirect:yourBook"
                    + "/?status=get_book&message="+ex.getMessage();
        }
    }
}