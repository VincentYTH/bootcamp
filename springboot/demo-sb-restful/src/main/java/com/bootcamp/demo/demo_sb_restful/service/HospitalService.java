package com.bootcamp.demo.demo_sb_restful.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.model.dto.Hospital;

public interface HospitalService {
  List<Hospital> getHospital();

  List<Hospital> getBedMoreThan(int bed);

  List<Hospital> getHospitalsOnYear(int year);
}
