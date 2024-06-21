package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.controller.UserOperation;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDto;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.ApiResp;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(value = "/v1")
public class UserController implements UserOperation{

  @Autowired
  private UserService userService;

  @Autowired
  private UserMapper userMapper;

  @Override
  public List<UserDTO> getUsers() throws JsonProcessingException{
    return userService.getUsers().stream()
      .map(e -> userMapper.mapToUser(e))
      .collect(Collectors.toList());
  }

  @Override
  public UserEntity saveUser(UserEntity users){
    // if (user.getPhone() == null)
    //   throw new RuntimeException(); // GlobalExceptionHandler
    return userService.save(users);
  }

  @Override
  public UserEntity deleteUser(Long id){
    return userService.deleteById(id);
  }

  @Override
  public ApiResp<UserEntity> updateUser(Long id, UserEntity user){
    return userService.updateUser(id, user);
  }

  @Override
  public UserEntity getUserById(Long id){
    return userService.getUserById(id);
  }

  @Override
  public UserEntity getUserByPhone(String phone){
    return userService.getUserByPhone(phone);
  }

  @Override
  public List<UserEntity> getUserByGeo(String addrLatitude, String addrLongtitude){
    return userService.getUserByGeo(addrLatitude, addrLongtitude);
  }

  @Override
  public UserEntity updateUserEmailById(Long id, UserReqDto userReqDto){
    return userService.updateUserEmailById(id, userReqDto);
  }

  @Override
  public List<UserEntity> findByAddrLatitudeGreaterThan(Double lat){
    return userService.findByAddrLatitudeGreaterThan(lat);
  }
}
