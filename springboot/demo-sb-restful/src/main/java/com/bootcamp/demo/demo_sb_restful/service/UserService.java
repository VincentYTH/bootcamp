package com.bootcamp.demo.demo_sb_restful.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDto;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.ApiResp;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserService {
  List<User> getUsers() throws JsonProcessingException;

  // List<User> addUsers(List<User> users);

  UserEntity save(UserEntity users);

  UserEntity deleteById(Long id);

  ApiResp<UserEntity> updateUser(Long id, UserEntity user);

  UserEntity getUserById(Long id);

  UserEntity getUserByPhone(String phone);

  List<UserEntity> getUserByGeo(String addrLatitude, String addrLongtitude);

  UserEntity updateUserEmailById(Long id, UserReqDto userReqDto);

  List<UserEntity> findByAddrLatitudeGreaterThan(Double lat);
}
