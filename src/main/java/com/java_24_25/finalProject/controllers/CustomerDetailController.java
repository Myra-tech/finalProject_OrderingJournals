package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.Calculator;
import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.models.Customer;
import com.java_24_25.finalProject.services.BookService;
import com.java_24_25.finalProject.services.PageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerDetailController {
    @Autowired
    PageDataService pageDataService;
    @Autowired
    BookService bookService;
    String totalPrice;


    @GetMapping("/the_book")
    public String showTheBookPage(Model model,
                                  @RequestParam(name = "coverType", required = true) String coverType,
                                  @RequestParam(name = "leatherType") String leatherType,
                                  @RequestParam(name = "colourOfLeather") String colourOfLeather,
                                  @RequestParam(name = "size") String size,
                                  @RequestParam(name = "numberOfPages") String numberOfPages,
                                  @RequestParam(name = "paperType") String paperType,
                                  @RequestParam(name = "paperBaseColour") String paperBaseColour,
                                  @RequestParam(name = "submitForm", required = false) String choice,
                                  @RequestParam(name="totalPrice", required = false) String totalPrice
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

        if (choice != null && choice.equalsIgnoreCase("order")){
            try {
                Book book = new Book(coverType, leatherType, colourOfLeather, size, numberOfPages, paperType, paperBaseColour, totalPrice);

                model.addAttribute("bookId", bookService.createBookZ(book).getId());
                model.addAttribute("totalPrice", totalPrice);

                return "contact";
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }


        Book book = new Book(coverType, leatherType, colourOfLeather, size, numberOfPages, paperType, paperBaseColour);
        bookService.calculatePrice(model, book);
        return "yourBook";
    }



    @PostMapping("/the_book")
    public String handleGetBook(Book book){
        try {
            BookService bookService = null;
            assert false;
            bookService.createBook(book);
            return "redirect:recipe";
        }catch (Exception ex){
            System.out.println(ex);
            return "redirect:recipe"
                    + "/?status=get_book&message="+ex.getMessage();
        }
    }

}