package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Superman2Test {
  
  @Mock
  private Cat cat; // mocked cat, but with all implementation by default

  @InjectMocks // something like calling the constructor by putting the mocked cat as param
  private Superman superman;

  @Test
  void testSum(){
    when(cat.sum(98, 10)).thenReturn(4);
    when(cat.subtract(100, 98)).thenReturn(3);
    assertEquals(99, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }

  void testSum2(){
    when(cat.sum(98, 10)).thenReturn(3);
    when(cat.subtract(100, 98)).thenReturn(3);
    assertEquals(99, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }
}
