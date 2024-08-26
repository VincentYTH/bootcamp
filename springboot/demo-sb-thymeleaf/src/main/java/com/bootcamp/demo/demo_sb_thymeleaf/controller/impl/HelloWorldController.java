package com.bootcamp.demo.demo_sb_thymeleaf.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_thymeleaf.controller.GreetingsOperation;

// API
@RestController // Controller (Web Layer) + ResponseBody (Json)
@RequestMapping(value = "/v1")
public class HelloWorldController implements GreetingsOperation {
  
  @Override
  public String hello(){
    return "Vincent";
  }

}
