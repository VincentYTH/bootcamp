package com.bootcamp.demo.demo_sb_restful.service.impl;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDto;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.ApiResp;
import com.bootcamp.demo.demo_sb_restful.infra.NotFoundException;
import com.bootcamp.demo.demo_sb_restful.infra.RedisHelper;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.repository.UserRepository;
import com.bootcamp.demo.demo_sb_restful.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class UserServiceimpl implements UserService {

  // During the server start, bean creation process will consider @Value
  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private RedisHelper redisHelper;

  // Spring will generate the class to implement the interface
  // then put it into
  @Autowired
  private UserRepository userRepository;

  // @Autowired
  // private AppConfig appConfig;

  @Override
  public List<User> getUsers() throws JsonProcessingException {
    // get for Redis
    User[] users = redisHelper.get("jph-users", User[].class);
    if (users != null) {
      return List.of(users);
    }
    // RestTemplate
    String url =
        UriComponentsBuilder.newInstance().scheme(Scheme.HTTPS.lowercase()) // https or http
            .host(this.domain).path(usersEndpoint).toUriString(); // handle "://"
    users = restTemplate.getForObject(url, User[].class);
    // new RestTemplate().getForObject
    // 1. call API, and get json result
    // 2. Convert json result to java object (User[].class)
    this.redisHelper.set("jph-users", users, Duration.ofMinutes(1L));
    return Arrays.asList(users);
  }

  // @Override
  // public List<User> addUsers(List<User> users){
  // String url = UriComponentsBuilder.newInstance()
  // .scheme(Scheme.HTTPS.lowercase())
  // .host(this.domain)
  // .path(usersEndpoint)
  // .toUriString();
  // User[] addUsers = restTemplate.getForObject(url, User[].class);

  // if (users.size() != 0)
  // users.add();
  // }

  @Override
  public UserEntity save(UserEntity users) {
    return userRepository.save(users);
  }

  @Override
  public UserEntity deleteById(Long id) { // if id not exists?
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      userRepository.deleteById(id);
      return userEntity.get();
    }
    throw new NotFoundException();
  }

  @Override
  public ApiResp<UserEntity> updateUser(Long id, UserEntity user) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      user.setId(id);
      userRepository.saveAndFlush(user);
      return ApiResp.<UserEntity>builder().ok().data(List.of(user)).build();
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity getUserById(Long id) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      return userEntity.get();
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity getUserByPhone(String phone) {
    Optional<UserEntity> userEntity = userRepository.findByPhone(phone);
    if (userEntity.isPresent()) {
      return userEntity.get();
    }
    throw new NotFoundException();
  }

  @Override
  public List<UserEntity> getUserByGeo(String addrLatitude,
      String addrLongtitude) {
    Optional<List<UserEntity>> userEntity = userRepository
        .findByAddrLatitudeAndAddrLongtitude(addrLatitude, addrLongtitude);
    if (userEntity.isPresent()) {
      return userEntity.get();
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity updateUserEmailById(Long id, UserReqDto userReqDto) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      UserEntity entity = userEntity.get();
      entity.setEmail(userReqDto.getEmail());
      userRepository.save(entity);
      return entity;
    }
    throw new NotFoundException();
  }

  @Override
  public List<UserEntity> findByAddrLatitudeGreaterThan(Double lat) {
    Optional<List<UserEntity>> userEntity =
        userRepository.findByAddrLatitudeGreaterThan(lat);
    if (userEntity.isPresent()) {
      return userEntity.get();
    }
    throw new NotFoundException();
  }

}
