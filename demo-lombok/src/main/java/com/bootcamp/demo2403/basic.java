package com.bootcamp.demo2403; // similar to sub-folder, group id

import java.util.ArrayList;
import java.util.List;

// import java.lang...

// create Java project -> JDK (java.lang)
// but you need to explicitly import java.util, etc.

// Command "mvn compile" -> check dependency -> download dependency
// Java Project = JDK + j.util + lombok
// target folder -> generated main + test class files (similar to Javac)

// Command "mvn clean" -> clear target folder

// command "mvn clean compile" -> clear target folder, check dependency, compile class folder

// command "mvn clean install" -> get folder, check dependency, compile class folder, bundle a single java

public class basic {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    int x = (int) Math.pow(2.0, 2.0);

    List<String> s = new ArrayList<>();

    Cat cat = new Cat("JO", 13);
  }
}
