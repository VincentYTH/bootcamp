package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.controller.WeatherOperation;
import com.bootcamp.demo.demo_sb_restful.dto.WeatherDTO;
import com.bootcamp.demo.demo_sb_restful.service.WeatherService;

@RestController
public class WeatherController implements WeatherOperation {
  @Autowired
  private WeatherService weatherService;

  @Override
  public Map<String, Map<LocalDate, List<WeatherDTO>>> getWeathers() {
    return weatherService.getWeathers();
  }
}
