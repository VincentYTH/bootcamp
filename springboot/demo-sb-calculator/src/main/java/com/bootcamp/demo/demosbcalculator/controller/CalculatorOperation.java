package com.bootcamp.demo.demosbcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {
  
  @GetMapping(value = "/sum/{x}/{y}")
  int sum(@PathVariable(value = "x") int salary,
          @PathVariable(value = "y") int bonus);

  @GetMapping(value = "/subtract/{x}/{y}")
  int subtract(@PathVariable int x, @PathVariable int y);

  @GetMapping(value = "/mutiply")
  int mulitply(@RequestParam(value = "a") int quantity,
               @RequestParam(value = "b") int price);

  @GetMapping(value = "/divide")
  int divide(@RequestParam int quantity, @RequestParam int price);

  @GetMapping(value = "/sum/double")
  String sum2(@RequestParam String q, @RequestParam String p);
}
