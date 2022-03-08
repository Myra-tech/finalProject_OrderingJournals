package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReceiptController {
//    @Autowired
    //  CustomerDetailController customerDetailController;

    @GetMapping("/receipt")
    public String showPersonalOrderStatusPage(Model model,
                                              @RequestParam(name = "customerName", required = true) String customerName,
                                              @RequestParam(name = "customerAddress") String customerAddress,
                                              @RequestParam(name = "customerEmail") String customerEmail) {

        Customer customer = new Customer(customerName, customerAddress, customerEmail);
        model.addAttribute("customerName", customer.getCustomerName());
        model.addAttribute("customerAddress", customer.getCustomerAddress());
        model.addAttribute("customerEmail", customer.getCustomerEmail());


        System.out.println("The user is checking the order status.");

        return "receipt";

    }


//    @GetMapping("/receipt")
//    public String showPersonalOrderStatusPage(Model model) {

//        model.addAttribute("yourOrder",
//                new Orders(1,
//                        new Customer("Lilian Walko", "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com"),
//                        200,
//                        true,
//                        OrderStatus.PLACED));
//
//        List<BookDetail> myBookDetails = new ArrayList<>();  // once selections will be made this should replace the code in yourBook page
//
//        myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
//        myBookDetails.add(new BookDetail("Leather type:", "chrome tanned", 20));
//        myBookDetails.add(new BookDetail("Colour of the leather:", "hardcover", 0));
//        myBookDetails.add(new BookDetail("Size:", "A5", 20));
//        myBookDetails.add(new BookDetail("The number of pages:", "150", 30));
//        myBookDetails.add(new BookDetail("The type of paper:", "thin", 10));
//        myBookDetails.add(new BookDetail("Base colour of the paper:", "beige", 0));
//        myBookDetails.add(new BookDetail("Vintage look features:", "distress spray stain", 30));
//        myBookDetails.add(new BookDetail("Cover prints:", "hand engravings", 50));
//        model.addAttribute("myBookDetails", myBookDetails);
//
//        System.out.println("The user is checking the order status.");
//
//        return "receipt";
//    }
//  I ENABLE showPersonalOrderStatusPage() JUST TO SEE WHETHER THE PROGRAM STILL HOLDS TOGETHER, THE PREVIOUS ISSUES STILL APPLY.
//  [I DISABLED showPersonalOrderStatusPage() BECAUSE IT RETURNS receipt JUST LIKE handleCustomerInformation() BUT IT MADE NO DIFFERENCE.]
    // showPersonalOrderStatusPage() DID WORK BEFORE.
}


//    @GetMapping("/receipt")
//    public String showPersonalOrderStatusPage(Model model) {
//
//        model.addAttribute("yourOrder", new Orders(1, "Lilian Walko",
//                "20 Kildare Street, D2 F8HK, Dublin, Ireland", "lilianwalko@email.com",
//                200, true, OrderStatus.PLACED));
//
//        List<BookDetail> myBookDetails = new ArrayList<>();  // once selections will be made this should replace the code in yourBook page
//
//        myBookDetails.add(new BookDetail("Cover type:", "hardcover", 50));
//        myBookDetails.add(new BookDetail("Leather type:","chrome tanned", 20));
//        myBookDetails.add(new BookDetail("Colour of the leather:","hardcover", 0));
//        myBookDetails.add(new BookDetail("Size:","A5", 20));
//        myBookDetails.add(new BookDetail("The number of pages:","150", 30));
//        myBookDetails.add(new BookDetail("The type of paper:","thin", 10));
//        myBookDetails.add(new BookDetail("Base colour of the paper:","beige", 0));
//        myBookDetails.add(new BookDetail("Vintage look features:","distress spray stain", 30));
//        myBookDetails.add(new BookDetail("Cover prints:","hand engravings", 50));
//        model.addAttribute("myBookDetails", myBookDetails);
//
//        System.out.println("The user is checking the order status.");
//
//        return "receipt";
//    }
//}
