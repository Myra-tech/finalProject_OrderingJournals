package com.java_24_25.finalProject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookDetail {
    private String codeOfDetail;
    private String detail;
    private String chosenFeature;
    double priceOfDetail;

    public BookDetail(String detail, String chosenFeature, double priceOfDetail) {
        this.detail = detail;
        this.chosenFeature = chosenFeature;
        this.priceOfDetail = priceOfDetail;
    }

    public BookDetail(String detail, double priceOfDetail) {
        this.detail = detail;
        this.priceOfDetail = priceOfDetail;
    }

    public double getPrice() {
        // get price from the database
        // make multiplication for features
        // return it for the calculator
        return 0;
    }
}
