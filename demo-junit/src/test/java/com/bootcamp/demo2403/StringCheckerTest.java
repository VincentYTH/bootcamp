package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringCheckerTest {
  
  @Test
  void testIsPalindrome(){
    assertTrue(StringChecker.isPalindrome("racar"));
    assertTrue(StringChecker.isPalindrome("araara"));
  }

  @Test
  void testSameString(){
    String s1 = "hello";
    String s2 = new String("hello");
    assertFalse(s1 == s2);
    assertNotSame(s1, s2); // assertNotSame -> they are not the same object
    String s3 = "hello";
    assertSame(s1, s3); // pass, s2 and s3 cannot pass
    assertEquals(s2, s3); // pass, check the value
  }
}
