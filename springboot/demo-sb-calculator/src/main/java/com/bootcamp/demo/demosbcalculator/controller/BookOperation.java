package com.bootcamp.demo.demosbcalculator.controller;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo.demosbcalculator.model.Book;

public interface BookOperation {
  
  @GetMapping(value = "/books/{author}")
  Book getBook(@PathVariable String author);

  @GetMapping(value = "/books/{author}/PublishDate")
  LocalDate getBookPublishDate(@PathVariable String author);

}
