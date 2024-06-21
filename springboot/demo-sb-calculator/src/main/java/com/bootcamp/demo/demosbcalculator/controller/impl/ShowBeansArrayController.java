package com.bootcamp.demo.demosbcalculator.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demosbcalculator.DemoSbCalculatorApplication;
import com.bootcamp.demo.demosbcalculator.controller.ShowBeansOperation;

@Controller
@ResponseBody
public class ShowBeansArrayController implements ShowBeansOperation{

  @Override
  public String[] showBeansArr(){
    return DemoSbCalculatorApplication.getContext().getBeanDefinitionNames();
  }
}
