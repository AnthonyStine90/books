package com.anthony.books.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anthony.books.models.Book;
import com.anthony.books.services.BookService;

@Controller
public class BookController {

  // connects to book service that gives access to the repository which gives access to the database
  @Autowired BookService bookService;

  @RequestMapping("/")
  public String index() {
    return "index.jsp";
  }



// ****CREATE*****

@PostMapping("/books")
public String createBook(

  @RequestParam("title") String title,
  @RequestParam("desc") String desc,
  @RequestParam("lang") String lang,
  @RequestParam("pages") Integer pages,
  HttpSession session  
) {
  Book book = new Book(title, desc, lang, pages);
  System.out.println(book);



return "redirect: /findall";
}


// *****Read All*****

@RequestMapping("/findall")
public String findAll(Model model) {
  List<Book> books = bookService.allBooks();
  model.addAttribute("books", books);
  return "findall.jsp";

}

// *****Read One*****
@GetMapping("/books/{id}")
public String show(@PathVariable("id") Long id, Model model){
  Book book = bookService.getOne(id);
  model.addAttribute("book", book);
  return "onebook.jsp";
}




// *****Update*****

// *****Delete*****


}