package com.bootcamp.demo.demo_sb_restful.model.dto;

import java.util.List;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ExOpenDataDTO {

  private List<String> types;
  private List<String> fields;
  private List<List<String>> data;
  private List<String> legands;

}
