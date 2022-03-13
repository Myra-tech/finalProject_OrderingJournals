package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.Calculator;
import com.java_24_25.finalProject.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ReceiptController {



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
}