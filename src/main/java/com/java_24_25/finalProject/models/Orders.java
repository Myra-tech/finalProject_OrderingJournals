package com.java_24_25.finalProject.models;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Orders {
    private UUID orderId;
    private int orderNumber; // after testing phase take it out and change it all to orderId, and activate it in the constructor
    private double totalPriceOfOrder;
    private boolean invoicePaid;

    private Customer customer;
    private OrderStatus orderStatus;

    public Orders(int orderNumber, Customer customer, double totalPriceOfOrder, boolean invoicePaid, OrderStatus orderStatus) {
        // this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.totalPriceOfOrder = totalPriceOfOrder;
        this.invoicePaid = invoicePaid;
        this.customer = customer;
        this.orderStatus = orderStatus;
    }

}

