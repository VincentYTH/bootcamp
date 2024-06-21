package com.bootcamp.demo.demo_exercise1.controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_exercise1.controller.CalculatorOperation;
import com.bootcamp.demo.demo_exercise1.dto.CalculatorDTO;
import com.bootcamp.demo.demo_exercise1.dto.mapper.InputMapper;
import com.bootcamp.demo.demo_exercise1.service.CalculatorService;

@RestController
public class CalculatorController implements CalculatorOperation {

  @Autowired
  private CalculatorService calculatorService;

  @Override
  public Object calculator(String valueA, String valueB, String operation)
      throws NumberFormatException {
    List<CalculatorDTO> result = new ArrayList<>();
    result.add(new CalculatorDTO(valueA, valueB, operation,
        calculatorService.calculator(valueA, valueB, operation)));
    return result;
  }

  @Override
  public Object calculator2(String valueA, String valueB, String operation) throws NumberFormatException {
    List<CalculatorDTO> result = new ArrayList<>();
    result.add(new CalculatorDTO(valueA, valueB, operation,
        calculatorService.calculator(valueA, valueB, operation)));
    return result;
  }

  @Override
  public Object input(InputMapper input) {
    return new InputMapper(input.getX(), input.getY(), input.getOperation());
  }

}
