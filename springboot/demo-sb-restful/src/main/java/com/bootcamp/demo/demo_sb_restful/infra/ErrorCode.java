package com.bootcamp.demo.demo_sb_restful.infra;

import lombok.Getter;

@Getter
public enum ErrorCode {
  NPE(99, "Null Pointer Exception."), NFE(100,
      "Number Format Exception."), AE(101, "Arithmetic Exception."),;

  private int code;
  private String desc;

  private ErrorCode(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }
}
