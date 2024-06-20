package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDto;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.ApiResp;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserOperation {
  @GetMapping(value = "/jsonplaceholder/users")
  List<UserDTO> getUsers() throws JsonProcessingException;

  @PostMapping(value = "/users")
  UserEntity saveUser(@RequestBody UserEntity users);

  @DeleteMapping(value = "/users")
  UserEntity deleteUser(@RequestParam Long id);

  // similar to SQL "update users where id = ?"
  // if id exists, update the user, return the updated user object
  // if id not exists, update nothing, return NotFoundException
  @PutMapping(value = "/users")
  ApiResp<UserEntity> updateUser(@RequestParam Long id, @RequestBody UserEntity user);

  @GetMapping(value = "/users/get_by_id/{id}")
  UserEntity getUserById(@PathVariable Long id);

  @GetMapping(value = "/users/get_by_phone/{phone}")
  UserEntity getUserByPhone(@PathVariable String phone);

  @GetMapping(value = "/users/get_by_geo")
  List<UserEntity> getUserByGeo(@RequestParam String addrLatitude, @RequestParam String addrLongtitude);

  @PatchMapping(value = "/users/get_by_email")
  UserEntity updateUserEmailById(@RequestParam Long id, @RequestBody UserReqDto userReqDto);

  @GetMapping(value = "/users/find_latitude_greater_than")
  List<UserEntity> findByAddrLatitudeGreaterThan(@RequestParam Double lat);
}
