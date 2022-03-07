package com.java_24_25.finalProject.services;

import com.java_24_25.finalProject.models.BookDetail;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("singleton")
public class ApplicationDAO {
    List<BookDetail> chosenBookDetails = new ArrayList<>();

    public ApplicationDAO() {
//        Here we expect depending on a feature the customer has chosen to receive the following aspects from the database.
//        chosenBookDetails.add(new BookDetail('detail', 'chosenFeature', 'priceOfDetail'));
//        The list of those make up the book order/ the book object / it is going to be used to calculate the price to return to the UI.
        chosenBookDetails.add(new BookDetail("coverType", "paperback", 20));  // !!! THE SPECULATIVE PRICE. THE REAL PRICE WILL COME FROM THE DB.

    }

    public BookDetail getBookDetail(String nameOfBookDetail) {
        return null;
    }

    public List<BookDetail> getBookDetails() {
        return null;
    }
}
