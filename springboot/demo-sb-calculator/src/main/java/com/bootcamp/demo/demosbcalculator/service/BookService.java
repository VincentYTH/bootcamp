package com.bootcamp.demo.demosbcalculator.service;

import java.util.Map;
import com.bootcamp.demo.demosbcalculator.model.Book;

public interface BookService {

  Map<Long, Book> getBookMap();
  
  Book getBook(String author);
}
