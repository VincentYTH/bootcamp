package com.bootcamp.demo.demosbcalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demosbcalculator.model.Customer;

public interface CustomerOperation {
  
  @GetMapping(value = "/customer/show_list")
  List<Customer> getCustomersList();


}
