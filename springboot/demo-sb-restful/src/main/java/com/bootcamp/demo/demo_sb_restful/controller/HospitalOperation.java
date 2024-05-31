package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo.demo_sb_restful.model.dto.Hospital;

public interface HospitalOperation {
  @GetMapping(value = "/hospital")
  List<Hospital> getHospital();

  @GetMapping(value = "/hospital/bed_more_than/{bed}") 
  List<Hospital> getBedMoreThan(@PathVariable int bed);

  @GetMapping(value = "/hospital/year/{year}")
  List<Hospital> getHospitalsOnYear(@PathVariable int year);
}
