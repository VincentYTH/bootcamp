package com.bootcamp.demo.demo_sb_dto.exceptions;

import com.bootcamp.demo.demo_sb_dto.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_dto.infra.Syscode;

public class UserNotFoundException extends BusinessRuntimeException {

  public UserNotFoundException(){
    super(Syscode.USER_ID_NOT_FOUND);
  }
}
