package com.bootcamp.demo.demo_sb_restful.infra;

import lombok.Getter;

@Getter
public enum Syscode {
  OK(0, "success."),
  NOT_FOUND(1, "not found."),
  USER_ID_NOT_FOUND(2, "User ID not found."),
  LIST_ADD_FAIL(3, "List Add Fail."),
  BED_NOT_ENOUGH(4, "The Beds are not enough."),
  HOSPITAL_NOT_FOUND(5, "Hospital not found.");

  private int code;
  private String desc;

  private Syscode(int code, String desc){
    this.code = code;
    this.desc = desc;
  }
}
