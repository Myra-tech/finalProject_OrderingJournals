package com.java_24_25.finalProject.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private long id;
//    private String bookName;
    private String coverType;
    private String leatherType;
    private String colourOfLeather;

    private String size;
    private int numberOfPages;
    private String paperType;

    private String paperBaseColour;
//    private String vintageLookTeaAging;
//    private String vintageLookCoffeeAging;
//    private String vintageLookSprayAging;
//    // private String coverPrints;
    // private String additionalStyleElements;
    // private String customerWishes;

    private Date orderDate;

    public Book(String bookName, String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
    }

}