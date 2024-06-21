package com.bootcamp.demo.demosbcalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DatabaseOperation {
  
  @GetMapping(value = "/database/get_value/{index}")
  String getValue(@PathVariable String index);

  @GetMapping(value = "/database/sort")
  List<Integer> sort2();

  @GetMapping(value = "/database/sorting")
  int[] sort();

  @GetMapping(value = "/database/initialization")
  String initialization();

  @GetMapping(value = "/database/put_value/{value}")
  String put(@PathVariable String value);
}
