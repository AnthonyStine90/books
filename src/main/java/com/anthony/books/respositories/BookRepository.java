package com.anthony.books.respositories;

import java.util.List;

import com.anthony.books.models.Book;

import org.springframework.data.repository.CrudRepository;

//connectes to our database, book is the list of books, long represents the id of a book

public interface BookRepository extends CrudRepository<Book, Long> {

  //find all books
  List<Book> findAll();


}