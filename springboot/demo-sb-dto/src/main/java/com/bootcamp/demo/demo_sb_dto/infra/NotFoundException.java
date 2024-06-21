package com.bootcamp.demo.demo_sb_dto.infra;

public class NotFoundException extends BusinessException {
  
  public NotFoundException(){
    super(Syscode.NOT_FOUND);
  }
}
