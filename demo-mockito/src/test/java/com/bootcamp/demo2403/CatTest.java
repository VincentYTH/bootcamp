package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CatTest {
  
  @Test
  void testSum(){
    Cat cat = new Cat();
    assertEquals(10, cat.sum(3, 7));
  }
}
