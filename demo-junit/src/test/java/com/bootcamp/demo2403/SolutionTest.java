package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  int x = 0;

  @BeforeEach
  void setUp(){
    this.x = 100;
  }

  @BeforeAll
  static void initialize(){
    System.out.println("Initialize");
  }

  @Test
  void textX(){
    this.x++;
    assertEquals(101, this.x);
  }

  @Test
  void textX2(){
    this.x++;
    assertEquals(101, this.x);
  }

  @Test
  void testSolution(){
    assertEquals(2, new Solution().getTotalCount(List.of("abc", "edf")));
  }
}
