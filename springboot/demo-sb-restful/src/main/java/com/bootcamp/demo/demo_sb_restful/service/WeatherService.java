package com.bootcamp.demo.demo_sb_restful.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import com.bootcamp.demo.demo_sb_restful.dto.WeatherDTO;

public interface WeatherService {
  Map<String, Map<LocalDate, List<WeatherDTO>>> getWeathers();
}
