package com.bootcamp.demo.demosbcalculator.controller.impl;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demosbcalculator.controller.BookOperation;
import com.bootcamp.demo.demosbcalculator.model.Book;
import com.bootcamp.demo.demosbcalculator.service.BookService;

@RestController // @Controller + @Responsbody
public class BookController implements BookOperation {
  // Controller layer should not contain business logic
  // for example, the way to "find a book by author" is a business logic
  // Controller -> call service layer

  @Autowired
  @Qualifier(value = "bookServiceFromDBImpl")
  private BookService bookServiceFromDB;

  @Autowired
  @Qualifier(value = "bookServiceFromMOImpl")
  private BookService bookServiceFromMO;

  @Override
  public Book getBook(String author){
    // return new BookServiceImpl().getBook("Sally");
    return bookServiceFromDB.getBook(author);
  }

  @Override
  public LocalDate getBookPublishDate(String author){
    Book book;
    if (author.length() > 5)
      book = bookServiceFromDB.getBook(author);
    else
      book = bookServiceFromMO.getBook(author);
    // return book.getAuthor().concat("-").concat(book.getPublishDate().toString());
    return book.getPublishDate();
  }
}
