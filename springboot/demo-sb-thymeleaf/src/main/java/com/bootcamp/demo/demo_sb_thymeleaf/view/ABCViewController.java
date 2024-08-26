package com.bootcamp.demo.demo_sb_thymeleaf.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demo_sb_thymeleaf.controller.GreetingsOperation;

// Thymeleaf:
// 1. Server Side Rendering
// 2. 

// Return HTML

@Controller
public class ABCViewController {

  @Autowired
  private GreetingsOperation greetingsOperation;
  
  @GetMapping(value = "/abc")
  public String abc(Model model){
    model.addAttribute("message", greetingsOperation.hello());
    return "abc"; // abc.html
  }
}
