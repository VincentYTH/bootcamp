package com.bootcamp.demo.demo_sb_restful.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO.AddressDTO;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO.CompanyDTO;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO.AddressDTO.LocationDTO;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;

@Component
public class UserMapper {
  
  public UserDTO mapToUser(User user){
    LocationDTO locationDTO = LocationDTO.builder()
      .latitude(user.getAddress().getGeo().getLatitude())
      .longtitude(user.getAddress().getGeo().getLongtitude())
      .build();

    CompanyDTO companyDTO = CompanyDTO.builder()
      .name(user.getCompany().getName())
      .business(user.getCompany().getBusiness())
      .build();

    AddressDTO addressDTO = AddressDTO.builder()
      .street(user.getAddress().getStreet())
      .suite(user.getAddress().getSuite())
      .city(user.getAddress().getCity())
      .geo(locationDTO)
      .build();

    return UserDTO.builder()
    .id(user.getId())
    .name(user.getName())
    .address(addressDTO)
    .company(companyDTO)
    .build();
  }
}
