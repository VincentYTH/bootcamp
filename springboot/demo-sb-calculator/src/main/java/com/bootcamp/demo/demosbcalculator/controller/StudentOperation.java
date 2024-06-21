package com.bootcamp.demo.demosbcalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo.demosbcalculator.model.Student;

public interface StudentOperation {
  
  @GetMapping(value = "/student/add_student/{studentID}/{name}")
  List<Student> addStudent(@PathVariable int studentID, @PathVariable String name);

  @GetMapping(value = "/student/show_list")
  List<Student> showList();

  @GetMapping(value = "/student/remove/{name}")
  List<Student> removeStudent(@PathVariable String name);

  @GetMapping(value = "/student/ids")
  List<Integer> getStudentID();

  @GetMapping(value = "/student/get_student/{name}")
  List<Student> getStudent(@PathVariable String name);
}
