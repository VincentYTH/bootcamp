package com.bootcamp.demo.demosbcalculator.controller.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demosbcalculator.controller.CustomerOperation;
import com.bootcamp.demo.demosbcalculator.model.Address;
import com.bootcamp.demo.demosbcalculator.model.Customer;
import com.bootcamp.demo.demosbcalculator.model.Order;

@Controller
@ResponseBody
public class CustomerController implements CustomerOperation {

  @Override
  public List<Customer> getCustomersList(){
    List<Address> addresses = new ArrayList<>();
    addresses.add(new Address("12345"));
    addresses.add(new Address("abcd"));
    addresses.add(new Address("kowloon"));
    
    List<Order> orders1 = new ArrayList<>();
    orders1.add(new Order(1, addresses));
    List<Order> orders2 = new ArrayList<>();
    orders2.add(new Order(2, addresses));
    orders2.add(new Order(3, addresses));
    
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Vincent", LocalDate.of(2013, 10, 3), orders1));
    customers.add(new Customer("Jenny", LocalDate.of(2015, 10, 3), orders2));

    return customers;
  }
}
