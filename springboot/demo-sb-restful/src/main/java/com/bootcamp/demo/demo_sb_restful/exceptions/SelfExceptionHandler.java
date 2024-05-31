package com.bootcamp.demo.demo_sb_restful.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.demo.demo_sb_restful.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_restful.infra.ErrorResponse;

@RestControllerAdvice
public class SelfExceptionHandler {

  // @ExceptionHandler(NotFoundException.class)
  // public ErrorResponse notFoundExceptionHandler(NotFoundException e) {
  //   return ErrorResponse.of(e.getCode(), e.getMessage());
  // }

  // @ExceptionHandler(UserNotFoundException.class)
  // public ErrorResponse userNotFoundException(UserNotFoundException e) {
  //   return ErrorResponse.of(e.getCode(), e.getMessage());
  // }

  @ExceptionHandler(BusinessRuntimeException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ErrorResponse businessRuntimeExceptionHandler(BusinessRuntimeException e){
    return ErrorResponse.of(e.getCode(), e.getMessage());
  }
}
