package com.bootcamp.demo.demosbcalculator.config;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bootcamp.demo.demosbcalculator.model.Cat;
import com.bootcamp.demo.demosbcalculator.model.Color;

@Configuration // new AppConfig() -> Spring Context
public class AppConfig {
  
  // private String name;

  public String sayHello(){
    return "hello";
  }

  @Bean(name = "white") // Create an object(bean) then put it into spring context
  // @Primary // Approach 1
  Cat createWhiteCat(){
    return new Cat("ABC", 3, List.of(Color.WHITE));
  }

  @Bean(name = "red")
  Cat createRedCat(){
    return new Cat("CDF", 2, List.of(Color.RED));
  }


}
