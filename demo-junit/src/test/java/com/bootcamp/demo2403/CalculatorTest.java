package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.*; // static import
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


// We can use static import to import the whole class
class CalculatorTest {

  @Test
  void testSum(){
    int actual = Calculator.sum(3, 4);
    assertEquals(7, actual);

    assertEquals(-11, Calculator.sum(-1, -10));
    assertEquals(1, Calculator.sum(4, -3));
    
    assertNotEquals(8, Calculator.sum(3, 4));
  }

  // Test-Driven Design
  @Test
  void testSubtract(){
    assertEquals(8, Calculator.subtract(-1, -9));
    assertEquals(8, Calculator.subtract(10, 2));
    assertEquals(0, Calculator.subtract(2, 2));
  }

  @Test
  void testSort(){
    int[] arr = new int[]{2, 4, 3, 1};
    assertArrayEquals(new int[]{1, 2, 3, 4}, Calculator.sort(arr));

    int[] arr2 = new int[]{5, 3, 3, 2, -1};
    assertArrayEquals(new int[]{-1, 2, 3, 3, 5}, Calculator.sort(arr2));
  }

  @ParameterizedTest
  @CsvSource({
    "2, 1, 1",
    "100, 59, 41",
    "-100, 110, -210"
  })
  void testSumEquals(int expected, int x, int y){
    assertEquals(expected, Calculator.sum(x, y));
  }

  @Test
  void testConcat(){
    assertEquals("abcde", Calculator.concat(List.of("ab", "cd", "e")));

    assertEquals("123A@e87", Calculator.concat(List.of("123", "A@", "e87")));
  }

  @Test
  void testTimeout(){
    // 500 ms -> 0.5 second
    assertTimeout(Duration.ofMillis(2000), () -> {
      String s = "";
      for (int i = 0; i < 100_000; i++){
        s += i;
      }
      System.out.println("s = " + s);
    });
  }


}
