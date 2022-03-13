package com.java_24_25.finalProject.models;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private int orderNumber; // after testing phase take it out and change it all to orderId, and activate it in the constructor
    private double totalPrice;
    private boolean invoicePaid;
    private Book book;

    private Customer customer;
    private OrderStatus orderStatus;

    public Orders(int orderNumber, Customer customer, double totalPriceOfOrder, boolean invoicePaid, OrderStatus orderStatus) {
        // this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
        this.invoicePaid = invoicePaid;
        this.customer = customer;
        this.orderStatus = orderStatus;
    }

}

