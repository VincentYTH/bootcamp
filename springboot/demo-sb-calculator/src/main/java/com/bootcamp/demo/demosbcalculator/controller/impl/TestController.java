package com.bootcamp.demo.demosbcalculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demosbcalculator.config.AppConfig;
import com.bootcamp.demo.demosbcalculator.controller.TestOperation;
import com.bootcamp.demo.demosbcalculator.model.Cat;

@Controller
@ResponseBody
public class TestController implements TestOperation {
  
  @Autowired // Find the appConfig object(bean) from spring context, and then 
  private AppConfig appConfig;

  //without Qualifier, 兩個Java objects share 一個bean

  @Autowired
  private AppConfig abc;

  // Implication: TestController object depends on cat object
  @Autowired
  @Qualifier(value = "white")
  private Cat whiteCat;

  @Autowired
  @Qualifier(value = "red")
  private Cat redCat;

  @Override
  public String testSayHello(){
    return new AppConfig().sayHello();
  }

  @Override
  public String testSayHello2(){
    return appConfig.sayHello();
  }

  @Override
  public boolean testTwoObj(){
    return abc == appConfig;
  }

  @Override
  public Cat getWhiteCat(){
    return this.whiteCat;
  }

  @Override
  public Cat getRedCat(){
    return this.redCat;
  }
}
