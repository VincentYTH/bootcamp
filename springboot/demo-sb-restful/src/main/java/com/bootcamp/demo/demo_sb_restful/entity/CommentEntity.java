package com.bootcamp.demo.demo_sb_restful.entity;

import org.springframework.data.annotation.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

// @Entity
// @Table(name = "Comments")
// @Getter
// public class CommentEntity {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Long id;

//   private String name;

//   private String email;

//   private String body;

//   @ManyToOne
//   @JoinColumn(name = "post_id")
//   private PostEntity post;
// }
