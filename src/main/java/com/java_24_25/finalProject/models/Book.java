package com.java_24_25.finalProject.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
    private String numberOfPages;
    private String paperType;
    private String paperBaseColour;
    private String totalPrice;

    @CreationTimestamp
    private Date orderDate;

    public Book(String coverType, String leatherType, String colourOfLeather, String size, String numberOfPages,
                String paperType, String paperBaseColour) {
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
    }

    public Book( String coverType, String leatherType, String colourOfLeather, String size, String numberOfPages,
                 String paperType, String paperBaseColour, String totalPrice) {

        this.id = id;
        this.coverType = coverType;
        this.leatherType = leatherType;
        this.colourOfLeather = colourOfLeather;
        this.size = size;
        this.numberOfPages = numberOfPages;
        this.paperType = paperType;
        this.paperBaseColour = paperBaseColour;
        this.totalPrice = totalPrice;
    }
}