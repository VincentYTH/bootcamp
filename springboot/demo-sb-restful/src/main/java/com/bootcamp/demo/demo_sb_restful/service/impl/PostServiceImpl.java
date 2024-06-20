package com.bootcamp.demo.demo_sb_restful.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.repository.PostRepository;
import com.bootcamp.demo.demo_sb_restful.service.PostService;

@Service
public class PostServiceImpl implements PostService {
  
  @Autowired
  PostRepository postRepository;

  @Override
  public PostEntity savePost(PostEntity post){
    return postRepository.save(post);
  }
}
