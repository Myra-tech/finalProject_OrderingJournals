package com.java_24_25.finalProject.services;

import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(Book book) throws Exception {
    book = new Book(book.getId(), book.getCoverType(), book.getLeatherType(), book.getColourOfLeather(), book.getSize(),
            book.getNumberOfPages(), book.getPaperType(), book.getPaperBaseColour(), book.getTotalPrice());
    bookRepository.save(book);
    }

    public List<Book> getBooks(){
return (List<Book>) bookRepository.findAll();
    }

    public Book getBookById(Long id) throws Exception {
        return this.bookRepository.findById(id).orElseThrow();
    }
    // responsible for helping with book related stuff
}
