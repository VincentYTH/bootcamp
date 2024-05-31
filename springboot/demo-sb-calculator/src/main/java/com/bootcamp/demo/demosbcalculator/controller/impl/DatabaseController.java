package com.bootcamp.demo.demosbcalculator.controller.impl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demosbcalculator.controller.DatabaseOperation;

@Controller
@ResponseBody
public class DatabaseController implements DatabaseOperation {

  private final static int[] database = new int[] {10, -3, 9};

  // Design an API, get the value from array by index
  @Override
  public String getValue(@PathVariable String index) {
    int index2 = 0;
    try {
      index2 = Integer.parseInt(index);
      return String.valueOf(database[index2]);
    } catch (NumberFormatException e) {
      return "The index must be a number!";
    } catch (ArrayIndexOutOfBoundsException e) {
      return "The index is out of bounds";
    }
  }

  // sort
  @Override
  public List<Integer> sort2() {
    List<Integer> sortArr = new LinkedList<>();
    for (int i : database) {
      sortArr.add(i);
    }
    return sortArr.stream().sorted((i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1).toList();
  }

  @Override
  public int[] sort(){
    java.util.Comparator<Integer> des = (i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1;
    // O(nlogn)
    int[] newArr = Arrays.stream(database)
    .boxed()
    .sorted(des)
    .mapToInt(e -> e.intValue())
    .toArray();

    // O(n)
    // for (int i = 0; i < database.length; i++){
    //   database[i] = newArr[i];
    // }

    return newArr;
  }

  private List<Integer> newDatabase = new LinkedList<>();

  @Override
  public String initialization(){
    newDatabase.clear();
    for (int i : database){
      newDatabase.add(i);
    }
    return newDatabase.toString();
  }

  @Override
  public String put(@PathVariable String value){
    try {
      newDatabase.add(Integer.parseInt(value));
      return newDatabase.stream()
      .sorted()
      .toList()
      .toString();
    } catch (NumberFormatException e) {
      return "The output should be a number of integer!";
    }
  }

}
