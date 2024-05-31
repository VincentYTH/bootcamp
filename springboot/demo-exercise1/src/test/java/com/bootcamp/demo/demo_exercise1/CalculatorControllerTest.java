package com.bootcamp.demo.demo_exercise1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.bootcamp.demo.demo_exercise1.controller.impl.CalculatorController;
import com.bootcamp.demo.demo_exercise1.service.CalculatorService;

@WebMvcTest(CalculatorController.class)
class CalculatorControllerTest {
  
  @Autowired
  private CalculatorController calculatorController;

  @MockBean
  private CalculatorService calculatorService;

  @Autowired
  private MockMvc mockMvc;

  @Test
  void testCalculator() throws Exception{

    Mockito.when(calculatorService.calculator("4", "2", "mul"))
      .thenReturn(String.valueOf(8));

    mockMvc.perform(MockMvcRequestBuilders.get("/operation").param("valueA", "4")
      .param("valueB", "2")
      .param("operation", "mul"))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$[*].result").value("8"));
  }
}
