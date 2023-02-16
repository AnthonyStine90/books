package com.anthony.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anthony.books.models.Book;
import com.anthony.books.respositories.BookRepository;

@Service
public class BookService {
    // connect to our repository with code below
    
    @Autowired BookRepository bookRepository;
    //allows spring to resolve and inject collaborating beans into our bean
    // gives acces to all the methods in our book repository


    // read all books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // read one book
    public Book getOne(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }
}

