package com.bootcamp.demo.demo_sb_restful.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demo_sb_restful.dto.WeatherDTO;

public interface WeatherOperation {
  @GetMapping(value = "/weathers")
  Map<String, Map<LocalDate, List<WeatherDTO>>> getWeathers();
}