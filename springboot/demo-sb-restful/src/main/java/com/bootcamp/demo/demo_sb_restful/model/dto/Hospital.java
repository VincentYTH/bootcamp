package com.bootcamp.demo.demo_sb_restful.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Hospital {
  @JsonProperty(value = "Financial Year")
  private String financialYear;
  @JsonProperty(value = "Cluster")
  private String cluster;
  @JsonProperty(value = "Hospital")
  private String hospital;
  @JsonProperty(value = "Specialty")
  private String specialty;
  @JsonProperty(value = "Hospital Beds")
  private int hospitalBeds;
}
