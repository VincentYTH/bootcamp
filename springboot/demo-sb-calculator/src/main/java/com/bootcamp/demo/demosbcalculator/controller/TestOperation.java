package com.bootcamp.demo.demosbcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demosbcalculator.model.Cat;

public interface TestOperation {
  
  @GetMapping(value = "/say_hello")
  String testSayHello();

  @GetMapping(value = "/say_hello2")
  String testSayHello2();

  @GetMapping(value = "/test_two_obj")
  boolean testTwoObj();

  @GetMapping(value = "/cat/get_white_cat")
  Cat getWhiteCat();

  @GetMapping(value = "/cat/get_red_cat")
  Cat getRedCat();

}
