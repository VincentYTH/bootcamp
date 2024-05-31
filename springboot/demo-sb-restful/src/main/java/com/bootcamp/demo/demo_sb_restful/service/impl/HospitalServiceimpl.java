package com.bootcamp.demo.demo_sb_restful.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo.demo_sb_restful.exceptions.BedNotEnoughException;
import com.bootcamp.demo.demo_sb_restful.exceptions.HospitalNotFoundException;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.infra.UrlBuilder;
import com.bootcamp.demo.demo_sb_restful.model.dto.Hospital;
import com.bootcamp.demo.demo_sb_restful.service.HospitalService;

@Service
public class HospitalServiceimpl implements HospitalService {
  @Value(value = "${api.json-gov-hospital.domain}")
  private String domain;

  @Value(value = "${api.json-gov-hospital.endpoints.data}")
  private String hospitalEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  private Hospital[] hospitals;

  @Override
  public List<Hospital> getHospital(){
    String url = UrlBuilder.get(Scheme.HTTPS, domain, hospitalEndpoint);
    // String url = UriComponentsBuilder.newInstance()
    //   .scheme(Scheme.HTTPS.lowercase())
    //   .host(this.domain)
    //   .path(activityEndpoint)
    //   .toUriString();
    hospitals = restTemplate.getForObject(url, Hospital[].class);
    return Arrays.asList(hospitals);
  }
  
  @Override
  public List<Hospital> getBedMoreThan(int bed){
    List<Hospital> hospitalsBedMoreThan = new ArrayList<>();
    for (Hospital h : hospitals){
      if (h.getHospitalBeds() >= bed)
      hospitalsBedMoreThan.add(h);
    }
    if (hospitalsBedMoreThan.size() == 0)
      throw new BedNotEnoughException();
    return hospitalsBedMoreThan;
  }

  @Override
  public List<Hospital> getHospitalsOnYear(int year){
    List<Hospital> hospitalsOnYear = new ArrayList<>();
    for (Hospital h : hospitals){
      if (Integer.parseInt(h.getFinancialYear().substring(0, 4)) == year)
        hospitalsOnYear.add(h);
    }
    if (hospitalsOnYear.size() == 0)
      throw new HospitalNotFoundException();
    return hospitalsOnYear;
  }
}
