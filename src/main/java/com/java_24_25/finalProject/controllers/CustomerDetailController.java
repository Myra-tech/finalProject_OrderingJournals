package com.java_24_25.finalProject.controllers;


import com.java_24_25.finalProject.Calculator;
import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.services.PageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerDetailController {

    @Autowired
    PageDataService pageDataService;

    @GetMapping("/the_book")
    public String showTheBookPage(Model model,
                                  @RequestParam(name = "coverType", required = true) String coverType,
                                  @RequestParam(name = "leatherType") String leatherType,
                                  @RequestParam(name = "colourOfLeather") String colourOfLeather,
                                  @RequestParam(name = "size") String size,
                                  @RequestParam(name = "numberOfPages") int numberOfPages,
                                  @RequestParam(name = "paperType") String paperType,
                                  @RequestParam(name = "paperBaseColour") String paperBaseColour,
                                  String totalPrice
    ) {

        System.out.println(pageDataService.getProjectTitle()); // shows in the console that it works

        model.addAttribute("projectTitle", pageDataService.getProjectTitle());
        model.addAttribute("pageInfo", pageDataService.getPage("yourBook"));
        model.addAttribute("availablePages", pageDataService.getPages());

        System.out.println("Book's input parameters are being extracted." + '\''
                + "Cover type: " + coverType + '\''
                + "Leather type: " + leatherType + '\''
                + "Colour of the leather: " + colourOfLeather + '\''
                + "Size of the book: " + size + '\''
                + "Number of pages: " + numberOfPages + '\''
                + "Paper type: " + paperType + '\''
                + "Paper base colour: " + paperBaseColour + '\''
        );

        Book book = new Book(coverType, leatherType, colourOfLeather, size, numberOfPages, paperType, paperBaseColour);
        model.addAttribute("coverType", coverType);
        model.addAttribute("leatherType", leatherType);
        model.addAttribute("colourOfLeather", colourOfLeather);
        model.addAttribute("size", size);
        model.addAttribute("numberOfPages", numberOfPages);
        model.addAttribute("paperType", paperType);
        model.addAttribute("paperBaseColour", paperBaseColour);

        Calculator calculator = new Calculator();
        double coverPrice = calculator.calculateThePriceForTheCover(coverType);
        double leatherTypePrice = calculator.calculateLeatherTypePrice(leatherType, coverType, size);
        double paperTypePrice = calculator.calculatePaperTypePrice(paperType, size, numberOfPages);
        double numberOfPagesPrice = calculator.calculateNumberOfPagesPrice(paperTypePrice, numberOfPages);

        double paperColorPrice = calculator.calculatePaperColorPrice(paperBaseColour, paperType, size, numberOfPages);
        double leatherColourPrice = calculator.calculateLeatherColorPrice(leatherType, colourOfLeather, size);

        double totalBookPrice = calculator.calculateTotalBookPrice(coverPrice, leatherTypePrice, numberOfPagesPrice, paperColorPrice, leatherColourPrice);
        model.addAttribute("totalPrice", String.format("%.2f", totalBookPrice));
        return "yourBook";
    }
}