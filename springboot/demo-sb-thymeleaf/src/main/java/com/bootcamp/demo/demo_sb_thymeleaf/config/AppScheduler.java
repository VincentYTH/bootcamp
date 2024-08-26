package com.bootcamp.demo.demo_sb_thymeleaf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_sb_thymeleaf.service.ApiService;

@Component
@EnableScheduling
public class AppScheduler {
  
  @Autowired
  ApiService apiService;

  @Scheduled(fixedRate = 300000)
  public void fetchAndUpdateData() throws InterruptedException{
    apiService.fetchCoinData();
  }
}
