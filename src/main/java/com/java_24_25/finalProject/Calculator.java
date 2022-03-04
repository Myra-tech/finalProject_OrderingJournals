package com.java_24_25.finalProject;

import com.java_24_25.finalProject.models.BookDetail;

import java.util.List;

public class Calculator {

        private final List<BookDetail> bookDetails;

        public Calculator(final List<BookDetail> bookDetails) {
            this.bookDetails = bookDetails;
        }

        public double calculateTotalAmount() {
            double total = 0;
            for (final BookDetail bookDetail : bookDetails) {
                total += bookDetail.getPrice();
            }
            return total;
        }
    }


    /*
    Book book = new Book();
    double totalPrice = 0;
    double entryPrice;

    // THE PRICE IS GOING TO BE CALCULATED SOMETHING LIKE THAT.
    // 1) take each chosen feature for the book
    // 2) find the availability and price in the database
    // 3) ascribe that to the variable called entry in the list of entries
    final List<Double> entries = new ArrayList<>();

    // 4) then for each entry sum the price and print out the totalPrice
       // //for void each(entry : entries) {
       // totalPrice += entryPrice;
        // totalPrice += entryPrice;
    }
       // System.out.println("The total for all transactions is " + totalPrice);
    */