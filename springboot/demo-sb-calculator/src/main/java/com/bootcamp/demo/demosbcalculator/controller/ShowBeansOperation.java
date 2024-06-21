package com.bootcamp.demo.demosbcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ShowBeansOperation {
  
  @GetMapping(value = "/show/beans")
  String[] showBeansArr();
}
