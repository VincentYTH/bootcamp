package com.bootcamp.demo.demosbhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/hk/api/v1")
public class HelloworldController {
  
  // API接口 (Application Programming Interface)
  @GetMapping(value = "/hello") // URI -> resource identifier
  public String hello(){
    return "hello world!";
  }

  
  @GetMapping(value = "/goodbye") // URI -> resource identifier
  public String hello2(){
    return "goodbye!";
  }

  public static void main(String[] args) {
    HelloworldController hc = new HelloworldController();
    System.out.println(hc.hello());
  }
}
