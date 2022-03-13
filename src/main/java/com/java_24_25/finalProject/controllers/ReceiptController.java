package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.Calculator;
import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.models.Customer;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@ToString
@Controller
public class ReceiptController {

    @GetMapping("/receipt")
    public String showPersonalOrderStatusPage(Model model,
                                              @RequestParam(name = "customerName", required = true) String customerName,
                                              @RequestParam(name = "customerAddress") String customerAddress,
                                              @RequestParam(name = "customerEmail") String customerEmail,
                                              String totalPrice){
        Customer customer = new Customer(customerName, customerAddress, customerEmail);
        model.addAttribute("customerName", customer.getCustomerName());
        model.addAttribute("customerAddress", customer.getCustomerAddress());
        model.addAttribute("customerEmail", customer.getCustomerEmail());

        System.out.println("The user is checking the order status.");

        Calculator calculator = new Calculator();
        double coverPrice = calculator.calculateThePriceForTheCover(
                String.valueOf(model.getAttribute("coverType")));
        double leatherTypePrice = calculator.calculateLeatherTypePrice(
                String.valueOf(model.getAttribute("leatherType")),
                String.valueOf(model.getAttribute("coverType")),
                String.valueOf(model.getAttribute("size")));
        double paperTypePrice = calculator.calculatePaperTypePrice(
                String.valueOf(model.getAttribute("paperType")),
                String.valueOf(model.getAttribute("size")),
                String.valueOf(model.getAttribute("numberOfPages")));
        double numberOfPagesPrice = calculator.calculateNumberOfPagesPrice(paperTypePrice,
                String.valueOf(model.getAttribute("numberOfPages")));
        double paperColorPrice = calculator.calculatePaperColorPrice(
                String.valueOf(model.getAttribute("paperBaseColour")),
                String.valueOf(model.getAttribute("paperType")),
                String.valueOf(model.getAttribute("size")),
                String.valueOf(model.getAttribute("numberOfPages")));
        double leatherColourPrice = calculator.calculateLeatherColorPrice(
                String.valueOf(model.getAttribute("leatherType")),
                String.valueOf(model.getAttribute("colourOfLeather")),
                String.valueOf(model.getAttribute("size")));

        double totalBookPrice = calculator.calculateTotalBookPrice(coverPrice, leatherTypePrice, numberOfPagesPrice, paperColorPrice, leatherColourPrice);
        model.addAttribute("totalPrice", String.format("%.2f", totalBookPrice));

        return "receipt";
    }

}