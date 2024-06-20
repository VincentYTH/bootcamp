package com.bootcamp.demo.demo_sb_restful.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo.demo_sb_restful.infra.RedisHelper;
import com.bootcamp.demo.demo_sb_restful.model.dto.Hospital;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class AppConfig {
  // WebClient -- Advanced library
  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Bean(name = "users")
  List<User> users() {
    return new ArrayList<>();
  }

  @Bean
  List<Hospital> hospitals() {
    return new ArrayList<>();
  }

  @Bean(name = "stations")
  List<String> stations() {
    return List.of("CCH", "CWB", "HKP");
  }

  @Bean(name = "dataTypes")
  List<String> dataTypes() {
    return List.of("CLMTEMP", "CLMMINT", "CLMMAXT");
  }

  // Difference between using RedisTemplate and RestTemplate
  // 1. You need to define the key, value type for RedisTemplate
  // 2. There are set() and get() method in RedisTemplate object.
  // You have to do serialzation and deserialzation yourself.

  @Bean
  ObjectMapper objectMapper() {
    return new ObjectMapper();
  }

  @Bean
  RedisHelper redisHelper(RedisConnectionFactory factory,
      ObjectMapper objectMapper) {
    return new RedisHelper(factory, objectMapper);
  }
}
