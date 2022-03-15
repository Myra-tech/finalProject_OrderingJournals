package com.java_24_25.finalProject.controllers;

import com.java_24_25.finalProject.models.Order;
import com.java_24_25.finalProject.repository.OrderRepository;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@ToString
@Controller
public class ReceiptController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/receipt")
    public String showPersonalOrderStatusPage(Model model,
                                              @RequestParam(name = "customerName", required = true) String customerName,
                                              @RequestParam(name = "customerAddress") String customerAddress,
                                              @RequestParam(name = "customerEmail") String customerEmail,
                                              @RequestParam(name = "bookId") String bookId,
                                              @RequestParam(name = "totalPrice") String totalPrice) {
        Order order = new Order(null, customerName, customerAddress, customerEmail, totalPrice);
        try {
            orderRepository.save(order);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        model.addAttribute("customerName", order.getCustomerName());
        model.addAttribute("customerAddress", order.getCustomerAddress());
        model.addAttribute("customerEmail", order.getCustomerEmail());
        model.addAttribute("totalPrice", totalPrice);

        System.out.println("The user is checking the order status.");

        return "receipt";
    }

}