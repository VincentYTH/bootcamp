package com.bootcamp.demo.demosbcalculator.controller.impl;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demosbcalculator.controller.CalculatorOperation;

@Controller
@ResponseBody
public class CalculatorController implements CalculatorOperation {
  
  @Override
  public int sum(@PathVariable(value = "x") int salary,
                 @PathVariable(value = "y") int bonus){
    return salary + bonus;
  }

  // we can acheieve default mapping by name if you do not explicitly define PathVariable value
  @Override
  public int subtract(@PathVariable int x, @PathVariable int y){
    return x - y;
  }

  @Override
  public int mulitply(@RequestParam(value = "a") int quantity,
                      @RequestParam(value = "b") int price){
    return quantity * price;
  }

  @Override
  public int divide(@RequestParam int quantity, @RequestParam int price){
    return quantity / price;
  }

  @Override
  public String sum2(@RequestParam String q, @RequestParam String p){
    double q2 = 0.0d;
    double p2 = 0.0d;
    try{
      q2 = Double.parseDouble(q);
      p2 = Double.parseDouble(p);
    } catch(NumberFormatException e){
      return "Both q and p should be numbers.";
    }
    return BigDecimal.valueOf(q2).add(BigDecimal.valueOf(p2)).toString();
  }

  public static void main(String[] args) {
    CalculatorController cc = new CalculatorController();
    cc.sum(10, 11);
    // CalculatorController.sum(10, 11);
  }
}
