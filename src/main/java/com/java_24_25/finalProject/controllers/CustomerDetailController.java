package com.java_24_25.finalProject.controllers;


import com.java_24_25.finalProject.models.BookDetail;
import com.java_24_25.finalProject.models.Customer;
import com.java_24_25.finalProject.models.OrderStatus;
import com.java_24_25.finalProject.models.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerDetailController {

//    @Autowired
//    PageDataService pageDataService;
//    @GetMapping("/the_book")
//    public String showTheBookPage(Model model) {
//        System.out.println(pageDataService.getProjectTitle());
//        model.addAttribute("pageInfo", pageDataService.getPage("yourBook"));
//        return "yourBook";
//    }

    @GetMapping("/the_book")
    // I wanted to place @PostMapping here, but the page immediately threw an error. And, yes, I did change it to "post" in the html document also.
    public String showTheBookPage(Model model) {

        model.addAttribute("theChosenCoverType", "hardcover");
        model.addAttribute("theChosenLeatherType", "vegetable tanned");
        model.addAttribute("theChosenColourOfLeather", "black");  // colour hex black #000

        model.addAttribute("yourOrder",
                new Orders(1,
                        new Customer("Lilian Walko", "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com"),
                        200,
                        true,
                        OrderStatus.PLACED));

        List<BookDetail> myBookDetails = new ArrayList<>();

        myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
        myBookDetails.add(new BookDetail("Leather type:", "chrome tanned", 20));
        myBookDetails.add(new BookDetail("Colour of the leather:", "black", 0));
        model.addAttribute("myBookDetails", myBookDetails);

        System.out.println("The user has submitted the order.");

        return "yourBook";
    }
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
