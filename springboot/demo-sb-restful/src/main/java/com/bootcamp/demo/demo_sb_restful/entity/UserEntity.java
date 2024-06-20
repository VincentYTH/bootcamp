package com.bootcamp.demo.demo_sb_restful.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// JPA will generate the DDL (Create Table) by the defintion in Entity Class
@Entity
@Table(name = "Users")
@Getter
@Setter
public class UserEntity {

  @Id // Table Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
  private Long id;

  private String name;

  @Column(name = "user_name")
  private String userName;

  private String email;

  private String phone;

  private String website;

  @Column(name = "addr_street")
  private String addrStreet;

  @Column(name = "addr_suite")
  private String addrSuite;

  @Column(name = "addr_city")
  private String addrCity;

  @Column(name = "addr_zipcode")
  private String addrZipcode;

  @Column(name = "addr_latitude")
  private String addrLatitude;

  @Column(name = "addr_longtitude")
  private String addrLongtitude;

  @Column(name = "company_name")
  private String companyName;

  @Column(name = "company_catch_phrase")
  private String companyCatchPhrase;

  @Column(name = "company_business")
  private String companyBusiness;

  // Procced 2:
  // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // "user" -> PostEntity.class attribute
  // @JsonManagedReference
  // private List<PostEntity> posts = new ArrayList<>();

  // Procced 1: // without foreign key
  // @OneToMany(cascade = CascadeType.ALL)
  // @JoinColumn(name = "user_id")
  // private List<PostEntity> posts = new ArrayList<>();
}
