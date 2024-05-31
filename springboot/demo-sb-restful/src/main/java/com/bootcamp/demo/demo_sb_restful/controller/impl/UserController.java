package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.controller.UserOperation;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.service.UserService;

@RestController
@RequestMapping(value = "/v1")
public class UserController implements UserOperation{

  @Autowired
  private UserService userService;

  @Autowired
  private UserMapper userMapper;

  @Override
  public List<UserDTO> getUsers(){
    return userService.getUsers().stream()
      .map(e -> userMapper.mapToUser(e))
      .collect(Collectors.toList());
  }
}
