package com.java_24_25.finalProject.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String coverType;
    private String leatherType;
    private String colourOfLeather;

    private String size;
    private int numberOfPages;
    private String paperType;

    private String paperBaseColour;
    private Date orderDate;
    private double bookTotalPrice;

    public Book(double bookTotalPrice) {
        this.bookTotalPrice = bookTotalPrice;
    }

    public Book(String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
    }
}