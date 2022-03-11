package com.java_24_25.finalProject.repository;

import com.java_24_25.finalProject.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    // PROGRAMMA NOJŪK JA BookRepository extends CrudRepository <Book>
    //    responsible for saving the book in the repository
    // Book findByBookDetail(String bookFeature);
// List<Book> findAll();
    }

