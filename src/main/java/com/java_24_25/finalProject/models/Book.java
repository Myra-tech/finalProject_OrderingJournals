package com.java_24_25.finalProject.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private String coverType;
    private String leatherType;
    private String colourOfLeather;
    private String size;
    private int numberOfPages;
    private String paperType;
    private String paperBaseColour;
    private String vintageLook;
    private String coverPrints;
    private String additionalStyleElements;
    private String customerWishes;

    private Date orderDate;

    public Book(String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour, Date orderDate) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
        this.orderDate = orderDate;
    }

    public Book(String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour, String vintageLook, Date orderDate) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
        this.vintageLook = vintageLook;
        this.orderDate = orderDate;
    }

    public Book(String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour, String vintageLook, String coverPrints, Date orderDate) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
        this.vintageLook = vintageLook;
        this.coverPrints = coverPrints;
        this.orderDate = orderDate;
    }

    public Book(String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour, String vintageLook, String coverPrints) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
        this.vintageLook = vintageLook;
        this.coverPrints = coverPrints;
    }

    public Book(String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour, String vintageLook, String coverPrints, String additionalStyleElements) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
        this.vintageLook = vintageLook;
        this.coverPrints = coverPrints;
        this.additionalStyleElements = additionalStyleElements;
    }

    public Book(String coverType, String leatherType, String colourOfLeather, String size, int numberOfPages, String paperType, String paperBaseColour, String vintageLook, String coverPrints, String additionalStyleElements, String customerWishes) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
        this.vintageLook = vintageLook;
        this.coverPrints = coverPrints;
        this.additionalStyleElements = additionalStyleElements;
        this.customerWishes = customerWishes;
    }
}