package com.java_24_25.finalProject.models;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "order_special")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String totalPrice;
}