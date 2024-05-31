package com.bootcamp.demo.demo_sb_restful.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.service.UserService;

@Service
public class UserServiceimpl implements UserService{

  // During the server start, bean creation process will consider @Value
  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  // @Autowired
  // private AppConfig appConfig;

  @Override
  public List<User> getUsers(){
    // RestTemplate
    String url = UriComponentsBuilder.newInstance()
      .scheme(Scheme.HTTPS.lowercase()) // https or http
      .host(this.domain)
      .path(usersEndpoint)
      .toUriString(); // handle "://"

    // System.out.println("url = " + url);

    User[] users = restTemplate.getForObject(url, User[].class);
    // new RestTemplate().getForObject
    // 1. call API, and get json result
    // 2. Convert json result to java object (User[].class)
    return Arrays.asList(users);
  }

  // @Override
  // public List<User> addUsers(List<User> users){
  //   String url = UriComponentsBuilder.newInstance()
  //     .scheme(Scheme.HTTPS.lowercase())
  //     .host(this.domain)
  //     .path(usersEndpoint)
  //     .toUriString();
  //   User[] addUsers = restTemplate.getForObject(url, User[].class);

  //   if (users.size() != 0)
  //     users.add();
  // }
}
