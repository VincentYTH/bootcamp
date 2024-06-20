package com.bootcamp.demo.demo_sb_restful.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.repository.UserRepository;

@Component
public class AppRunner implements CommandLineRunner{
  
  // AppRunner bean already exists in Context after Server start
  @Autowired
  private UserRepository userRepository;

  // run() will be executed by Spring before completed Server start process 
  @Override
  public void run(String... args){
    // throw new RuntimeException(); // Server start error
    userRepository.save(new UserEntity());
  }
}
