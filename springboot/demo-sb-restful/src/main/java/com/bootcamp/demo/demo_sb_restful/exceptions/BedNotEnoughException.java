package com.bootcamp.demo.demo_sb_restful.exceptions;

import com.bootcamp.demo.demo_sb_restful.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_restful.infra.Syscode;

public class BedNotEnoughException extends BusinessRuntimeException {
  
  public BedNotEnoughException(){
    super(Syscode.BED_NOT_ENOUGH);
  }
}
