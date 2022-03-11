package com.java_24_25.finalProject;

import com.java_24_25.finalProject.models.Book;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Book> bookDetails = new ArrayList<>();

    public double calculateTotalAmount() {

        // Book book = new Book("hardcover", "chrome tanned", "black", "A5", 150, "thin", "beige", "distress spray stain", "hand engravings");

        double total = 0;
        for (final Book bookDetail : this.bookDetails) {
            //    total += bookDetail.getPrice();
        }
        return total;
    }
}