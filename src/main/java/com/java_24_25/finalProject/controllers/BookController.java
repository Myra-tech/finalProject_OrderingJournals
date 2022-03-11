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

//    @Autowired
//    BookRepository bookRepository;

    @GetMapping("/create")
    public String showCreateTheBookPage(Model model) {
        model.addAttribute("projectTitle", pageDataService.getProjectTitle());
        model.addAttribute("pageInfo", pageDataService.getPage("createTheBook"));
        System.out.println("The user is creating a book.");

        return "createTheBook";
    }

//    @PostMapping("/create")
//    public String handleClientChoices(Book book) {
//        System.out.println("this handles client choices");
//        System.out.println(book);
//        bookRepository.save(book);
////        return "redirect:createTheBook";
////        return "createTheBook";
//        return "redirect:create";   /// after 'redirect' you give the link not the html file
//    }

}
