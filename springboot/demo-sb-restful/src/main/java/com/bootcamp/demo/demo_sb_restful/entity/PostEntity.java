package com.bootcamp.demo.demo_sb_restful.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Posts")
@Getter
@Setter
public class PostEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  private String body;

  // Directional Relationship
  @ManyToOne
  @JoinColumn(name = "user_id") // DB table column name
  // @JsonBackReference
  private UserEntity user; // object
}
