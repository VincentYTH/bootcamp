public class DemoForloop2 {
  public static void main(String[] args) {//shortcut: main+enter

    //Single loop
    for(int i=0; i<5; i++){//0,1,2,3,4
      System.out.print("*");
    }

    //Nested loop
    for(int i=0; i<3; i++){
      for (int j=0; j<2; j++){
        System.out.println("i="+i+",j="+j);
      }
      System.out.println("Hi");
    } 
// i=0,j=0
// i=0,j=1
// i=1,j=0
// i=1,j=1
// i=2,j=0
// i=2,j=1

    //*****
    //****
    //***
    //**
    //*
    int n=5;
    for(int i=0; i<n; i++){
      for(int j=n; j>i; j--){
        System.out.print("*");
      }
      System.out.println();
    }

    //Searching
    //Find the index of the second of space charater. If exists, print the index, if no, return N/A.
    String str = "abcdefg hello world!";
    int SpaceCount = 0;
    for (int i=0; i<str.length(); i++){
        if(str.charAt(i) == ' ' && ++SpaceCount == 2){
        System.out.println("index="+i);
        break;
      }
     }
    if (SpaceCount < 2) {
      System.out.println("N/A");
    }

    //break;
    for (int i=0; i<10; i++){
      if (i>3) {
        break;//break the nearest loop
      }
      System.out.println("Hi");
    }

    //continue;
    for (int i=0; i<5; i++){
      System.out.println("abc");
      if (i>2) {
        continue;//skip the rest and go to next iteration
      }
      System.out.println("Hello");
    }



















    //    *
    //   ***
    //  *****
    // *******
    //*********
    // *******
    //  *****
    //   ***
    //    *


  }
}
