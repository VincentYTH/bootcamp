package com.bootcamp.demo.demo_sb_restful.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WeatherDTO {
  private String dataType;
  private String value;
  private String completeness;
}