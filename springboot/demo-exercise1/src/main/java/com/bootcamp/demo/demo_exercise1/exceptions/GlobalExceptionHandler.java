package com.bootcamp.demo.demo_exercise1.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.demo.demo_exercise1.dto.ErrorResponse;
import lombok.Getter;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @Getter
  private enum ErrorCode {
    IVI(9, "Invalid Input");

    private int code;
    private String desc;

    private ErrorCode(int code, String desc) {
      this.code = code;
      this.desc = desc;
    }
  }

  @ExceptionHandler(NumberFormatException.class)
  public ErrorResponse numberFormatExceptionHandler(NumberFormatException e) {
    return new ErrorResponse(ErrorCode.IVI.getCode(), ErrorCode.IVI.getDesc());
  }
}
