package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;

public interface UserOperation {
  @GetMapping(value = "/jsonplaceholder/users")
  List<UserDTO> getUsers();
}
