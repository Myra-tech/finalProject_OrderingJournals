package com.java_24_25.finalProject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private String customerName;
    private String customerAddress;
    private String customerEmail;
}
