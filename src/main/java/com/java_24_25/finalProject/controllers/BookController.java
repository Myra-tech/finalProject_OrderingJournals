package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.services.PageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    PageDataService pageDataService;

    @GetMapping("/create")
    public String showCreateTheBookPage(Model model) {
        model.addAttribute("projectTitle", pageDataService.getProjectTitle());
        model.addAttribute("pageInfo", pageDataService.getPage("createTheBook"));
        System.out.println("The user is creating a book.");

        return "createTheBook";
    }

////    THIS DOES NOT REVEAL THE USER
//    @PostMapping("/create")
//    public String handleClientChoices(Book book) {
//        System.out.println(book);
//        return "redirect:createTheBook";
//    }
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

