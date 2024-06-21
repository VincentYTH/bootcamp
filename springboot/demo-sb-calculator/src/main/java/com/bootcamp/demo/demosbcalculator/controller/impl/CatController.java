package com.bootcamp.demo.demosbcalculator.controller.impl;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demosbcalculator.controller.CatOperation;
import com.bootcamp.demo.demosbcalculator.model.Cat;
import com.bootcamp.demo.demosbcalculator.model.Color;

@Controller
@ResponseBody
public class CatController implements CatOperation {
  
  // Java method returns Java object (Cat)
  // Spring Boot web layer (serialization - from java object to json)
  @Override
  public Cat test(){
    return new Cat("ABC", 13, List.of(Color.RED));
  }

  // API return List<Cat>
  @Override
  public List<Cat> getCatsList(){
    return Cat.catsList;
  }

  @Override
  public List<Cat> addCat(@PathVariable String name, @PathVariable int age){
    Cat.catsList.add(new Cat(name, age, List.of(Color.RED)));
    return Cat.catsList;
  }

  @Override
  public Cat[] getCatsArr(){
    return new Cat[]{new Cat("Vincent", 10, List.of(Color.BLACK)), new Cat("Ray", 15, List.of(Color.BLUE))};
  }

}
