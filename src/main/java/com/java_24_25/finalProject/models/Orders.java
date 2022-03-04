package com.java_24_25.finalProject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Orders {
    private int orderNumber;
    /// LATER CHANGE TO private UUID orderNumber;
    private final String customerName;
    private String customerAddress;
    private String customerEmail;
    private double totalPriceOfOrder;
    private boolean invoicePaid;
    private OrderStatus orderStatus;

}
