package com.java_24_25.finalProject;

import com.java_24_25.finalProject.models.BookDetail;
import com.java_24_25.finalProject.models.OrderStatus;
import com.java_24_25.finalProject.models.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

// HTTP request goes to the controller.
// This annotation marks that the class acts as a controller.
@Controller // It will interact with the HTTP request when a user looks to visit a page.
public class ApplicationController {


/*@GetMapping("/create")
public String handleBookOrderSubmission(Model model,
                                        @RequestParam(name = "coverType", required = true) String  coverType,
                                        @RequestParam(name = "leatherType") String leatherType,
                                        @RequestParam(name = "colourOfLeather") String colourOfLeather,
                                        @RequestParam(name = "size") String size,
                                        @RequestParam(name = "numberOfPages") int numberOfPages,
                                        @RequestParam(name = "paperType") String paperType,
                                        @RequestParam(name = "paperBaseColour") String paperBaseColour,
                                        @RequestParam(name = "vintageLook", required = false) String vintageLook,
                                        @RequestParam(name = "coverPrints", required = false) String coverPrints,
                                        @RequestParam(name = "additionalStyleElements", required = false) String additionalStyleElements,
                                        @RequestParam(name = "customerWishes", required = false) String customerWishes
                                        ) {
    System.out.println("The user is creating a book.");
    System.out.println("Book's input parameters are being extracted." + '\''
            + "Cover type: " + coverType + '\''
            + "Leather type: " + leatherType + '\''
            + "Colour of the leather: " + colourOfLeather + '\''
            + "Size of the book: " + size + '\''
            + "Number of pages: " + numberOfPages + '\''
            + "Paper type: " + paperType + '\''
            + "Paper base colour: " + paperBaseColour + '\''
            + "Vintage look: " + vintageLook + '\''
            + "Cover prints: " + coverPrints + '\''
            + "Additional style elements: " + additionalStyleElements + '\''
            + "Customer wishes: " + customerWishes);


    // model.addAttribute("The book order submitted" + '\n' + "Please add the shipping details.");
    return "bookCreated";
}
    @GetMapping("/bookCreated")                                                           // By default, it goes to the index page.
    public String showBookCreatedPage(Model model) {                               // The following method shows what happens when a user arrives to that page.

        model.addAttribute("coverType", "hardcover");
        model.addAttribute("leatherType", "vegetable tanned");
        model.addAttribute("leatherColour", "onionBrown");
        model.addAttribute("size", "A4");
        model.addAttribute("numberOfPages", 200);
        model.addAttribute("paperType","sketch-paper");
        model.addAttribute("paperBaseColour", "beige");
        model.addAttribute("coverPrints", "handEngravings");
        model.addAttribute("additionalStyleElements", "bookmarks");

        //System.out.println("The user is creating a book.");
        return "bookCreated";
    }
*/

    /*@GetMapping("/create")                                                           // By default, it goes to the index page.
public String showCreateTheBookPage(Model model) {                               // The following method shows what happens when a user arrives to that page.

    System.out.println("The user is creating a book.");

    List<BookDetail> myBookDetails = new ArrayList<>();  // once selections will be made this should replace the code in yourBook page

    myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
    myBookDetails.add(new BookDetail("Leather type:","chrome tanned", 20));
    myBookDetails.add(new BookDetail("Colour of the leather:","hardcover", 0));
    myBookDetails.add(new BookDetail("Size:","A5", 20));
    myBookDetails.add(new BookDetail("The number of pages:","150", 30));
    myBookDetails.add(new BookDetail("The type of paper:","thin", 10));
    myBookDetails.add(new BookDetail("Base colour of the paper:","beige", 0));
    myBookDetails.add(new BookDetail("Vintage look features:","distress spray stain", 30));
    myBookDetails.add(new BookDetail("Cover prints:","hand engravings", 50));
    model.addAttribute("myBookDetails", myBookDetails);

    return "createTheBook";
}
*/

    @GetMapping("/create")                                                           // By default, it goes to the index page.

    public String handleBookOrderSubmission(Model model,
                                            @RequestParam(name = "coverType", required = true) String  coverType,
                                            @RequestParam(name = "leatherType") String leatherType,
                                            @RequestParam(name = "colourOfLeather") String colourOfLeather,
                                            @RequestParam(name = "size") String size,
                                            @RequestParam(name = "numberOfPages") int numberOfPages,
                                            @RequestParam(name = "paperType") String paperType,
                                            @RequestParam(name = "paperBaseColour") String paperBaseColour,
                                            @RequestParam(name = "vintageLook", required = false) String vintageLook,
                                            @RequestParam(name = "coverPrints", required = false) String coverPrints,
                                            @RequestParam(name = "additionalStyleElements", required = false) String additionalStyleElements,
                                            @RequestParam(name = "customerWishes", required = false) String customerWishes
    ) {

        System.out.println("The user is creating a book. Book's input parameters are being extracted.");

        // model.addAttribute("The book order submitted" + '\n' + "Please add the shipping details.");
        //return "bookCreated";
        return "createTheBook";
    }


    @GetMapping("/the_book")  // By default, it goes to the index page.
    // The following method shows what happens when a user arrives to that page.
    public String showTheBookPage(Model model) {

        model.addAttribute("coverType", "hardcover");
        model.addAttribute("leatherType", "vegetable tanned");
        model.addAttribute("leatherColour", "onionBrown");
        model.addAttribute("size", "A4");
        model.addAttribute("numberOfPages", 200);
        model.addAttribute("paperType","sketch-paper");
        model.addAttribute("paperBaseColour", "beige");
        model.addAttribute("coverPrints", "handEngravings");
        model.addAttribute("additionalStyleElements", "bookmarks");
        model.addAttribute("yourOrder", new Orders(1, "Lilian Walko",
                "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com",
                200, true, OrderStatus.PLACED));

        System.out.println("The user has submitted the order.");

        // return "<h2> Welcome to your personal orders page. </h2>";
        return "yourBook";
    }

    @GetMapping("/receipt")
    public String showPersonalOrderStatusPage(Model model) {

        model.addAttribute("yourOrder", new Orders(1, "Lilian Walko",
                "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com",
                200, true, OrderStatus.PLACED));

        List<BookDetail> myBookDetails = new ArrayList<>();  // once selections will be made this should replace the code in yourBook page

        myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
        myBookDetails.add(new BookDetail("Leather type:","chrome tanned", 20));
        myBookDetails.add(new BookDetail("Colour of the leather:","hardcover", 0));
        myBookDetails.add(new BookDetail("Size:","A5", 20));
        myBookDetails.add(new BookDetail("The number of pages:","150", 30));
        myBookDetails.add(new BookDetail("The type of paper:","thin", 10));
        myBookDetails.add(new BookDetail("Base colour of the paper:","beige", 0));
        myBookDetails.add(new BookDetail("Vintage look features:","distress spray stain", 30));
        myBookDetails.add(new BookDetail("Cover prints:","hand engravings", 50));
        model.addAttribute("myBookDetails", myBookDetails);

        System.out.println("The user is checking the order status.");

        return "receipt";
    }
}

