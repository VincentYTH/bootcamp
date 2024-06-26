package com.bootcamp.demo.demosbcalculator.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
  private static final AtomicLong count = new AtomicLong(0);
  private Long id;
  private String author;
  private LocalDate publishDate;

  public Book(String author, LocalDate publishDate){
    id = count.incrementAndGet();
    this.author = author;
    this.publishDate = publishDate;
  }
}
