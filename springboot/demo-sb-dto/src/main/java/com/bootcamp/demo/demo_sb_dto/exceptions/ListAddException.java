package com.bootcamp.demo.demo_sb_dto.exceptions;

import com.bootcamp.demo.demo_sb_dto.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_dto.infra.Syscode;

public class ListAddException extends BusinessRuntimeException {

  public ListAddException(){
    super(Syscode.LIST_ADD_FAIL);
  }
}
