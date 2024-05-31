package com.bootcamp.demo.demosbcalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo.demosbcalculator.model.Cat;

public interface CatOperation {
  
  @GetMapping(value = "/cat/test")
  Cat test();

  // API return List<Cat>
  @GetMapping(value = "/cat/show_list")
  List<Cat> getCatsList();

  @GetMapping(value = "/cat/add_cat/{name}/{age}")
  List<Cat> addCat(@PathVariable String name, @PathVariable int age);

  @GetMapping(value = "/cat/show_array")
  Cat[] getCatsArr();

}
