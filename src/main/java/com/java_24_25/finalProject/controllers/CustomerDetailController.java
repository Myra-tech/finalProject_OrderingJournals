package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.services.PageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerDetailController {
    Book book;
    @Autowired
    PageDataService pageDataService;

    @GetMapping("/the_book")
    public String showTheBookPage(Model model,
                                  @RequestParam(name = "bookName", required = true) String bookName,
                                  @RequestParam(name = "coverType", required = true) String coverType,
                                  @RequestParam(name = "leatherType", required = true) String leatherType,
                                  @RequestParam(name = "size", required = true) String size,
                                  @RequestParam(name = "numberOfPages", required = true) int numberOfPages,
                                  @RequestParam(name = "paperType", required = true) String paperType,
                                  @RequestParam(name = "paperColor", required = true) String paperColor,
                                  @RequestParam(name = "leatherColor", required = true) String leatherColor,
                                  @RequestParam(name = "leatherColorComment,", required = true) String leatherColorComment,

                                  @RequestParam(name = "vintagePaper", required = false) String vintagePaper,
                                  @RequestParam(name = "coverLayer", required = false) String coverLayer,
                                  @RequestParam(name = "closure", required = false) String closure,
                                  @RequestParam(name = "print", required = false) String print,
                                  @RequestParam(name = "printComment", required = false) String printComment,
                                  @RequestParam(name = "bookmark", required = false) String bookmark,
                                  @RequestParam(name = "screwStuds", required = false) String screwStuds,
                                  @RequestParam(name = "screwStudComment", required = false) String screwStudComment,
                                  @RequestParam(name = "generalComment", required = false) String generalComment) {

        System.out.println(pageDataService.getProjectTitle()); // shows in the console that it works

        // Now here we add it as an attribute what will be shipped to the html.
        model.addAttribute("projectTitle", pageDataService.getProjectTitle());
        model.addAttribute("pageInfo", pageDataService.getPage("yourBook"));
        model.addAttribute("availablePages", pageDataService.getPages());
        // then html can use this to display a page "yourBook"

        System.out.println("Book's input parameters are being extracted." + '\''
                + "The name of the book: " + bookName + '\''
                + "Cover type: " + coverType + '\''
                + "Leather type: " + leatherType + '\''
                + "Size of the book: " + size + '\''
                + "Number of pages: " + numberOfPages + '\''
                + "Paper type: " + paperType + '\''
                + "Paper base colour: " + paperColor + '\''
                + "Colour of the leather: " + leatherColor + '\''
                + "Comment about the color of the leather" + leatherColorComment + '\''
                + "Vintage look: " + vintagePaper + '\''
                + "Layers on the cover" + coverLayer + '\''
                + "Book closure system" + closure + '\''
                + "Cover prints: " + print + '\''
                + "Comment about the prints" + printComment + '\''
                + "Bookmark" + bookmark + '\''
                + "Screw stud decoration" + screwStuds + '\''
                + "Comment about the screw studs" + screwStudComment + '\''
                + "Any other comment about the design" + generalComment);

        Book book = new Book(bookName, coverType, leatherType, size, numberOfPages, paperType, paperColor,
                leatherColor, leatherColorComment, vintagePaper, coverLayer, closure, print, printComment, bookmark,
                screwStuds, screwStudComment, generalComment);
        model.addAttribute("bookName",bookName);
        model.addAttribute("coverType",coverType);
        model.addAttribute("leatherType",leatherType);
        model.addAttribute("size",size);
        model.addAttribute("numberOfPages",numberOfPages);
        model.addAttribute("paperType",paperType);
        model.addAttribute("paperColor",paperColor);
        model.addAttribute("leatherColor",leatherColor);
        model.addAttribute("leatherColorComment,",leatherColorComment);
        model.addAttribute("vintagePaper",vintagePaper);
        model.addAttribute("coverLayer",coverLayer);
        model.addAttribute("closure",closure);
        model.addAttribute("print",print);
        model.addAttribute("printComment",printComment);
        model.addAttribute("bookmark",bookmark);
        model.addAttribute("screwStuds",screwStuds);
        model.addAttribute("screwStudComment",screwStudComment);
        model.addAttribute("generalComment",generalComment);

        return"yourBook";
        }

    }