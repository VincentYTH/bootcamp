package com.bootcamp.demo.demosbhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloworldController {
  
  // API接口 (Application Programming Interface)
  @GetMapping(value = "/v1/hello") // URI -> resource identifier
  public String hello(){
    return "hello world!";
  }

  @GetMapping(value = "/v2/hello") // URI -> resource identifier
  public String hello2(){
    return "goodbye!";
  }

  public static void main(String[] args) {
    HelloworldController hc = new HelloworldController();
    System.out.println(hc.hello());
  }
}
