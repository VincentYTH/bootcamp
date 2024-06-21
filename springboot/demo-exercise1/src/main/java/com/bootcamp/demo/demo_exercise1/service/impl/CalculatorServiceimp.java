package com.bootcamp.demo.demo_exercise1.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_exercise1.service.CalculatorService;

@Service
public class CalculatorServiceimp implements CalculatorService {

  @Override
  public String calculator(String valueA, String valueB, String operation) {
    double numValueA = Double.parseDouble(valueA);
    double numValueB = Double.parseDouble(valueB);
    if ("add".equals(operation))
      return String.valueOf(BigDecimal.valueOf(numValueA)
          .add(BigDecimal.valueOf(numValueB)).doubleValue());
    if ("sub".equals(operation))
      return String.valueOf(BigDecimal.valueOf(numValueA)
          .subtract(BigDecimal.valueOf(numValueB)).doubleValue());
    if ("mul".equals(operation))
      return String.valueOf(BigDecimal.valueOf(numValueA)
          .multiply(BigDecimal.valueOf(numValueB)).doubleValue());
    if ("div".equals(operation))
      return BigDecimal.valueOf(numValueA)
          .divide(BigDecimal.valueOf(numValueB), RoundingMode.HALF_UP)
          .toString();
    else
      return "Invalid input.";
  }
}
