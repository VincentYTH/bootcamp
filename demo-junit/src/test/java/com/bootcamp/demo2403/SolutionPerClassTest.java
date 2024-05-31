package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class SolutionPerClassTest {
  int x = 0;

  @BeforeAll // befor all test case
  void setUp(){
    this.x = 100;
  }

  @Test
  @Order(1)
  void testX(){
    this.x++;
    assertEquals(101, this.x);
  }

  @Test
  @Order(2)
  void testX2(){
    this.x++;
    assertEquals(102, this.x);
  }
}
