package internalcache;

public class DemoInteger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1 == i2);// true(defalut)
    System.out.println(System.identityHashCode(i1));// 798154996
    System.out.println(System.identityHashCode(i2));// 798154996

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3 == i4);// false(>127)
    System.out.println(System.identityHashCode(i3));// 681842940
    System.out.println(System.identityHashCode(i4));// 1392838282

    // Integer, Byte, Long, Short -> support Internal Cache
    // Float, Double -> do not support Internal Cache

    Float f1 = Float.valueOf(127.02f);
    Float f2 = Float.valueOf(127.02f);
    System.out.println(f1 == f2);// false
    System.out.println(System.identityHashCode(f1));// 523429237
    System.out.println(System.identityHashCode(f2));// 664740647

    Character c1 = Character.valueOf('z');
    Character c2 = Character.valueOf('z');
    System.out.println(c1 == c2);// true

    Character c3 = Character.valueOf('$');
    Character c4 = Character.valueOf('$');
    System.out.println(c3 == c4);// true

    Character c5 = Character.valueOf('哦');
    Character c6 = Character.valueOf('哦');
    System.out.println(c5 == c6);// false(not support chinese)
  }
}
