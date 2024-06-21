package com.bootcamp.demo.demosbcalculator.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demosbcalculator.controller.StudentOperation;
import com.bootcamp.demo.demosbcalculator.model.Student;

@Controller
@ResponseBody
public class StudentController implements StudentOperation {
  
  // API: add student
  // API: get student List
  // API: remove student by student name
  // API: get all student id -> int[]
  // API: get student by student name

  @Override
  public List<Student> addStudent(@PathVariable int studentID, @PathVariable String name){
    Student.studentDB.add(new Student(studentID, name));
    return Student.studentDB;
  }

  @Override
  public List<Student> showList(){
    return Student.studentDB;
  }

  @Override
  public List<Student> removeStudent(@PathVariable String name){
    if (name == null)
      return null;
    List<Student> tobeRemoved = new ArrayList<>();
    for (Student s : Student.studentDB){
      if (name.equals(s.getName()))
        tobeRemoved.add(s);
    }
    return Student.studentDB.removeAll(tobeRemoved)
      ? tobeRemoved : null;
  }

  @Override
  public List<Integer> getStudentID(){
    return Student.studentDB.stream()
    .map(e -> e.getIdNumber())
    .collect(Collectors.toList());
  }

  @Override
  public List<Student> getStudent(@PathVariable String name){
    if (name == null)
      return null;
    List<Student> student = new ArrayList<>();
    for (Student s : Student.studentDB){
      if (name.equals(s.getName()))
        student.add(s);
    }
    return Student.studentDB.containsAll(student)
      ? student : null;
  }

}
