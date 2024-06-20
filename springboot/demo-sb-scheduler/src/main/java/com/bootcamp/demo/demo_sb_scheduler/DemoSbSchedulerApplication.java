package com.bootcamp.demo.demo_sb_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class DemoSbSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbSchedulerApplication.class, args);
	}

}
