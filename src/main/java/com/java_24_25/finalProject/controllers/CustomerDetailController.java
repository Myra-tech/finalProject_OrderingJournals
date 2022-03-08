package com.java_24_25.finalProject.controllers;


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
    BookController bookController;

    @GetMapping("/the_book")
    public String showTheBookPage(Model model,
                                  @RequestParam(name = "coverType", required = true) String coverType,
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

        System.out.println(pageDataService.getProjectTitle()); // shows in the console that it works

        // Now here we add it as an attribute what will be shipped to the html.
        model.addAttribute("projectTitle", pageDataService.getProjectTitle());
        model.addAttribute("pageInfo", pageDataService.getPage("yourBook"));
        model.addAttribute("availablePages", pageDataService.getPages());
        // then html can use this to display a page "yourBook"

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

        Book book = new Book(coverType, leatherType, colourOfLeather, size, numberOfPages, paperType, paperBaseColour, coverPrints, additionalStyleElements);
        model.addAttribute("coverType", coverType);
        model.addAttribute("leatherType", leatherType);
        model.addAttribute("colourOfLeather", colourOfLeather);
        model.addAttribute("size", size);
        model.addAttribute("numberOfPages", numberOfPages);
        model.addAttribute("paperType", paperType);
        model.addAttribute("paperBaseColour", paperBaseColour);
        model.addAttribute("coverPrints", coverPrints);
        model.addAttribute("additionalStyleElements", additionalStyleElements);

        return "yourBook";
    }





//    @Autowired
//    PageDataService pageDataService;
//
//    @GetMapping("/the_book")
//    public String showTheBookPage(Model model,
//                                  @RequestParam(name = "customerName", required = true) String customerName,
//                                  @RequestParam(name = "customerAddress") String customerAddress,
//                                  @RequestParam(name = "customerEmail") String customerEmail) {
//
//        System.out.println(pageDataService.getProjectTitle()); // shows in the console that it works
//
//        // Now here we add it as an attribute what will be shipped to the html.
//        model.addAttribute("projectTitle", pageDataService.getProjectTitle());
//        model.addAttribute("pageInfo", pageDataService.getPage("yourBook"));
//        model.addAttribute("availablePages", pageDataService.getPages());
//        // then htlm can use this to display a page "yourBook"
//
////        Customer customer = new Customer(customerName, customerAddress, customerEmail);
////        model.addAttribute("customerName", customer.getCustomerName());
////        model.addAttribute("customerAddress", customer.getCustomerAddress());
////        model.addAttribute("customerEmail", customer.getCustomerEmail());
//////        And this should travel to the "receipt" page
//
//        return "yourBook";
//    }

//    @GetMapping("/the_book")
//    // I wanted to place @PostMapping here, but the page immediately threw an error. And, yes, I did change it to "post" in the html document also.
//    public String showTheBookPage(Model model) {
//
//        model.addAttribute("theChosenCoverType", "hardcover");
//        model.addAttribute("theChosenLeatherType", "vegetable tanned");
//        model.addAttribute("theChosenColourOfLeather", "black");  // colour hex black #000
//
//        model.addAttribute("yourOrder",
//                new Orders(1,
//                        new Customer("Lilian Walko", "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com"),
//                        200,
//                        true,
//                        OrderStatus.PLACED));
//
//        List<BookDetail> myBookDetails = new ArrayList<>();
//
//        myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
//        myBookDetails.add(new BookDetail("Leather type:", "chrome tanned", 20));
//        myBookDetails.add(new BookDetail("Colour of the leather:", "black", 0));
//        model.addAttribute("myBookDetails", myBookDetails);
//
//        System.out.println("The user has submitted the order.");
//
//        return "yourBook";
//    }
//
//    @GetMapping("/shipping_details")
//    public String handleCustomerInformation(
//            Model model,
//            @RequestParam(name="customerName") String customerName,
//            @RequestParam(name="customerAddress") String customerAddress,
//            @RequestParam(name="customerEmail") String customerEmail
//    ) {
//        // THE FOLLOWING THING WORKS. THE FOLLOWING STATEMENT HAS RECEIVED THE INPUT.
//        System.out.println("New customer details have arrived from " + customerName + ".");
//
//        // THIS MIGHT WORK AS WELL, IT'S JUST THAT IT DOES NOT GO INTO THE RECEIPT.
//        model.addAttribute("Customer name: ", customerName);
//        model.addAttribute("customerAddress: ", customerAddress);  // this variation makes no difference in the receipt page
//        model.addAttribute("Customer address: ", customerEmail);
//
//        return "receipt";
//    }

//    **************************************

//    @GetMapping("/shipping_details")
//    public void handleCustomerInformation(
//            Model model,
//            @RequestParam(name="customerName") Customer.setCustomerName(),
//    @RequestParam(name="customerAddress") Customer setCustomerAddress(),
//    @RequestParam(name="customerEmail") Customer setCustomerEmail()
//            ) {
//
//        return new Customer(setCustomerName, setCustomerAddress(), setCustomerEmail());
//    }
}
