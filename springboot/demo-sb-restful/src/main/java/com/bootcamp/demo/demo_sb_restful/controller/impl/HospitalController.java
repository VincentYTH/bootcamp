package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.controller.HospitalOperation;
import com.bootcamp.demo.demo_sb_restful.model.dto.Hospital;
import com.bootcamp.demo.demo_sb_restful.service.HospitalService;

@RestController
public class HospitalController implements HospitalOperation{
  
  @Autowired
  private HospitalService hospitalService;

  @Override
  public List<Hospital> getHospital(){
    return hospitalService.getHospital();
  }

  @Override
  public List<Hospital> getBedMoreThan(int bed){
    return hospitalService.getBedMoreThan(bed);
  }

  @Override
  public List<Hospital> getHospitalsOnYear(int year){
    return hospitalService.getHospitalsOnYear(year);
  }
}
