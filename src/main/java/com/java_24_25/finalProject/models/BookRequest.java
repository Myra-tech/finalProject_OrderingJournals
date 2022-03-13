package com.java_24_25.finalProject.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookRequest {
    private Long id;
    private String coverType;
    private String leatherType;
    private String colourOfLeather;
    private String size;
    private int numberOfPages;
    private String paperType;
    private String paperBaseColour;
    private String totalPrice;
}
