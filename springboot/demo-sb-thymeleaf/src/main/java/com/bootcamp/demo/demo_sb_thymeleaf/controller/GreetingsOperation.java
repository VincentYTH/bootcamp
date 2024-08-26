package com.bootcamp.demo.demo_sb_thymeleaf.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface GreetingsOperation {
  
  @GetMapping(value = "/hello")
  String hello();

}
