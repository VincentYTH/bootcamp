package com.bootcamp.demo.demo_sb_scheduler.config;

import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AppScheduler {
  
  @Scheduled(fixedDelay = 5000) // 5000ms = 5s
  @Async
  public void sayHello() throws InterruptedException{
    System.out.println("task1 start: " + LocalDateTime.now());
    Thread.sleep(10000);
    System.out.println("task1 end: " + LocalDateTime.now());
  }

  @Scheduled(fixedRate = 6000)
  @Async
  public void sayGoodBye() throws InterruptedException{
    System.out.println("task2 start: " + LocalDateTime.now());
    Thread.sleep(5000);
    System.out.println("task2 end: " + LocalDateTime.now());
  }

  @Scheduled(cron = "0 47 17 12 6 MON-FRI") // run at 17:47:00 Every weekday on 12th Jun (LocalDateTime), "*" represent all
  public void runTask(){
    System.out.println("cron job!!!");
  }
}
