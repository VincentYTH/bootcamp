package com.bootcamp.demo.demo_sb_restful.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder // @AllArgsConstructor
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
  private int id;
  private String name;
  // private String username;
  // private String email;
  private AddressDTO address;
  // private String phone;
  // private String website;
  private CompanyDTO company;

  @Builder
  @Getter
  public static class AddressDTO {
    private String street;
    private String suite;
    private String city;
    // private String zipcode;
    private LocationDTO geo;

    @Builder
    @Getter
    public static class LocationDTO {
      @JsonProperty(value = "lat")
      private String latitude;
      @JsonProperty(value = "lng")
      private String longtitude;
    }
  }

  @Builder
  @Getter
  public static class CompanyDTO {
    private String name;
    // private String catchPhrase;
    @JsonProperty(value = "bs")
    private String business;
  }


}
