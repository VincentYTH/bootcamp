package literalpool;

public class DemoString {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";
    String s3 = "hello ";
    String s4 = new String("hello");
    String s5 = String.valueOf("hello");

    System.out.println(System.identityHashCode(s));// 798154996 hashcode -> object address
    System.out.println(System.identityHashCode(s2));// 798154996
    System.out.println(System.identityHashCode(s3));// 681842940
    System.out.println(System.identityHashCode(s4));// 1392838282
    System.out.println(System.identityHashCode(s5));// 798154996

    System.out.println(s == s2);// true
    System.out.println(s == s5);// true
    System.out.println(s == s4);// false

    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb1 == sb2);// false

    String str = "aaa";
    System.out.println(System.identityHashCode(str));
    str = str + "bbb";
    System.out.println(System.identityHashCode(str));


  }
}
