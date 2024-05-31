package com.bootcamp.demo2403;

import java.util.Arrays;
import java.util.List;

public class Calculator {
  
  public static int sum(int x, int y){
    return x + y;
  }

  public static int subtract(int x, int y){
    return x - y;
  }

  public static int[] sort(int[] arr){
    Arrays.sort(arr);
    return arr;
  }

  public static String concat(List<String> strings){
    StringBuilder sb = new StringBuilder();
    for (String s : strings){
      sb.append(s);
    }
    return sb.toString();
  }

}