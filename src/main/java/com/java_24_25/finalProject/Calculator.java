package com.java_24_25.finalProject;

import com.java_24_25.finalProject.models.Book;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Book> bookDetails = new ArrayList<>();

    public double calculateTotalAmount() {

        Book book = new Book("hardcover", "chrome tanned", "black", "A5", 150,
                "thin", "beige", "distress spray stain", "hand engravings");

        double total = 0;
        for (final Book bookDetail : this.bookDetails) {
            //    total += bookDetail.getPrice();
        }
        return total;
    }



    /*

      public Calculator(final List<Book> bookDetails) {
            this.bookDetails = bookDetails;
        }
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


//    private List<Book> bookDetails = new ArrayList<>();
//
//    public double calculateTotalAmount() {
//
//        Book book = new Book("hardcover", "chrome tanned", "black", "A5", 150,
//                "thin","beige", "distress spray stain", "hand engravings");
//
//        double total = 0;
//        for (final Book bookDetail : bookDetails) {
//            //    total += bookDetail.getPrice();
//        }
//        return total;
//    }
}