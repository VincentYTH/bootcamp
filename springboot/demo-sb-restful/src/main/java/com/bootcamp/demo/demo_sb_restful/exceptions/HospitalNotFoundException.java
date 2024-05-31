package com.bootcamp.demo.demo_sb_restful.exceptions;

import com.bootcamp.demo.demo_sb_restful.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_restful.infra.Syscode;

public class HospitalNotFoundException extends BusinessRuntimeException {
  
  public HospitalNotFoundException(){
    super(Syscode.HOSPITAL_NOT_FOUND);
  }
}
