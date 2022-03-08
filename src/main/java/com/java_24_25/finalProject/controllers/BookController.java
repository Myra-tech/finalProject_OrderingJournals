package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @GetMapping("/create")
    public String showCreateTheBookPage(Model model) {
        System.out.println("The user is creating a book.");
        return "createTheBook";
    }
    @PostMapping("/create")
    public String handleCreateTheBookPage(Model model) {
        return "redirect:/the_book";
    }
}

//@Controller
//public class BookController {
//    @GetMapping("/create")
//    public String showCreateTheBookPage(Model model) {
////        Šim būtu jādarbojas /the_book lapā
//        model.addAttribute("coverType", "hardcover");
//        model.addAttribute("leatherType", "vegetable tanned");
//        model.addAttribute("colourOfLeather", "black");  // colour hex black #000
//        return "createTheBook";
//    }

