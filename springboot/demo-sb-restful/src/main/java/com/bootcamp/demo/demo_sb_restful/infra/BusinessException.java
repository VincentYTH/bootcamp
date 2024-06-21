package com.bootcamp.demo.demo_sb_restful.infra;

import lombok.Getter;

@Getter
public class BusinessException extends Exception {
  
  private int code;

  public BusinessException(Syscode syscode){
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }

  
}
