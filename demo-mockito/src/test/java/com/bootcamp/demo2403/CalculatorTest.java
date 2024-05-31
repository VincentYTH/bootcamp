package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // inject a set of annoution
public class CalculatorTest {
  
  @Mock
  private Cat MockedCat;

  @Test
  void testCalculatorSum(){
    // assume "new Cat(8, 10).sum()", then return 100
    // cat.sum() testing already completed in CarTest.java
    // so, calculator.sum() should fo2cus on its own logic (something + 3)
    Mockito.when(this.MockedCat.sum(8, 10)).thenReturn(100);

    Calculator calculator = new Calculator(8, MockedCat);
    int result = calculator.sum(); // -> new Cat(8, 10).sum() + 3
    assertEquals(103, result);

    // verify() is to ensure calculator.sum() had called cat.sum()
    verify(this.MockedCat, times(1)).sum(8, 10);
  }
}
