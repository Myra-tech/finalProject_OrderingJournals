package com.java_24_25.finalProject.services;

import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.models.BookRequest;
import com.java_24_25.finalProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

public class BookService {
    BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(BookRequest bookRequest) throws Exception {
    Book book = getBookById(bookRequest.getId());
    book = new Book(bookRequest.getId(), bookRequest.getCoverType(), bookRequest.getLeatherType(),
            bookRequest.getColourOfLeather(), bookRequest.getSize(), bookRequest.getNumberOfPages(),
            bookRequest.getPaperType(), bookRequest.getPaperBaseColour(), bookRequest.getTotalPrice());
bookRepository.save(book);
}
    public Book getBookById(Long id) throws Exception {
        return this.bookRepository.findById(id).orElseThrow();
    }
//    responsible for helping with book related stuff
}
