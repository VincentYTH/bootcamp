package com.bootcamp.demo2403;

public class StringChecker {
  public static boolean isPalindrome(String s){
    return new StringBuilder().append(s).reverse().toString().equals(s);
  }
}
