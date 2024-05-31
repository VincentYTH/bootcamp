package com.bootcamp.demo.demo_exercise1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorResponse {
  private int code;
  private String message;
}
