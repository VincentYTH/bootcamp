package com.bootcamp.demo.demo_sb_restful.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;

public interface UserService {
  List<User> getUsers();

  // List<User> addUsers(List<User> users);
}
