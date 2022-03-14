package com.java_24_25.finalProject.services;

import com.java_24_25.finalProject.Calculator;
import com.java_24_25.finalProject.models.Book;
import com.java_24_25.finalProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(Book book) throws Exception {
        bookRepository.save(book);
    }

    public Book createBookZ(Book book) throws Exception {
        return bookRepository.save(book);
    }

    public List<Book> getBooks(){
return (List<Book>) bookRepository.findAll();
    }

    public Book getBookById(Long id) throws Exception {
        return this.bookRepository.findById(id).orElseThrow();
    }
    // responsible for helping with book related stuff

    public Model calculatePrice(Model model, Book book){

        model.addAttribute("coverType", book.getCoverType());
        model.addAttribute("leatherType", book.getLeatherType());
        model.addAttribute("colourOfLeather", book.getColourOfLeather());
        model.addAttribute("size", book.getSize());
        model.addAttribute("numberOfPages", book.getNumberOfPages());
        model.addAttribute("paperType", book.getPaperType());
        model.addAttribute("paperBaseColour", book.getPaperBaseColour());

        Calculator calculator = new Calculator();
        double coverPrice = calculator.calculateThePriceForTheCover(book.getCoverType());
        double leatherTypePrice = calculator.calculateLeatherTypePrice( book.getLeatherType(), book.getCoverType(), book.getSize());
        double paperTypePrice = calculator.calculatePaperTypePrice(book.getPaperType(), book.getSize(), book.getNumberOfPages());
        double numberOfPagesPrice = calculator.calculateNumberOfPagesPrice(paperTypePrice, book.getNumberOfPages());

        double paperColorPrice = calculator.calculatePaperColorPrice(book.getPaperBaseColour(), book.getPaperType(), book.getSize(), book.getNumberOfPages());
        double leatherColourPrice = calculator.calculateLeatherColorPrice(book.getLeatherType(), book.getColourOfLeather(), book.getSize());

        double totalBookPrice = calculator.calculateTotalBookPrice(coverPrice, leatherTypePrice, numberOfPagesPrice,
                paperColorPrice, leatherColourPrice);
        model.addAttribute("totalPrice", String.format("%.2f", totalBookPrice));

        return model;
    }
}
