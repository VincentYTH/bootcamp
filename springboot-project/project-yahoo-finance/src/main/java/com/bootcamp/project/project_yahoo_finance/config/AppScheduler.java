package com.bootcamp.project.project_yahoo_finance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.bootcamp.project.project_yahoo_finance.service.DataBaseService;

@Component
public class AppScheduler {

  @Autowired
  DataBaseService dataBaseService;
  
  @Scheduled(fixedRate = 300000) // run every 5 mins
  @Async
  public void fetchAndSaveStockData() throws InterruptedException{
    dataBaseService.fetchAndSaveStockData();
    System.out.println("Fetch and Save the Stock Data success.");
  }

  @Scheduled(cron = "0 55 8 * * *")
  @Async
  public void clearRedisEntries() {
    dataBaseService.clearRedis();
  }
}
