package com.anthony.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anthony.books.models.Book;
import com.anthony.books.services.BookService;

// use restcontroller is you want to return json/data
// good for java backend
@RestController
public class BooksApi {

  @Autowired
  BookService bookService;

  // autowired is shorthand for the code below
  // final makes BookService immutable
  // private final BookService bookService;

  // public BooksApi(BookService bookService) {
  //   this.bookService = bookService;
  // }

  @RequestMapping("/api/books")
  public List<Book> booksApi() {
    List<Book> books = bookService.allBooks();
    return books;
  }
}
