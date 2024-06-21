package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
/**
 * Difference between Spring and Java (the way to manage the dependency)
 */
public class TestController {
  
  private UserService userService;

  public TestController(UserService userService) throws Exception{
    if (userService == null)
      throw new Exception();
    this.userService = userService;
  }

  public List<User> test() throws JsonProcessingException{
    return this.userService.getUsers();
  }

  // public static void main(String[] args) throws JsonProcessingException {
  //   TestController testController = null;
  //   try {
  //     testController = new TestController(null); // Checked Excepiton
  //   } catch (Exception e) {
      
  //   }
  //   testController.test(); // NPE
  // }
}
