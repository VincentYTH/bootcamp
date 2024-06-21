package com.bootcamp.demo.demo_sb_dto.infra;

import lombok.Getter;

@Getter
public class BusinessRuntimeException extends RuntimeException {
  
  private int code;

  public BusinessRuntimeException(Syscode syscode){
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }
}
