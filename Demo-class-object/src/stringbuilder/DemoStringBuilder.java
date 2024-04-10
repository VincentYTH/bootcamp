package stringbuilder;

public class DemoStringBuilder {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "def";

    String result = s1 + s2;
    String result2 = s1.concat(s2);// concat() -> return new String

    StringBuilder sb1 = new StringBuilder();
    System.out.println(sb1.toString());// ""

    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb2.toString());// hello

    StringBuilder sb3 = sb2.append(" world");// apend = concat
    System.out.println("sb2 = " + sb2.toString());// sb2 = hello world -> will change itself
    System.out.println("sb3 = " + sb3.toString());// sb3 = hello world

    sb2.append("!!!");
    System.out.println(sb2);// hello world!!!

    String[] strings = new String[]{"aaa", "bbb", "ccc"};
    StringBuilder sb4 = new StringBuilder();
    for (String x : strings){
      sb4.append(x);
    }
    System.out.println(sb4.toString());// aaabbbccc

    // insert()
    sb4.insert(9, "ddd");
    System.out.println(sb4);// aaabbbcccddd

    System.out.println(sb4.reverse());// dddcccbbbaaa
    System.out.println(sb4);// dddcccbbbaaa ..changed itself
    System.out.println(sb4.reverse());// aaabbbcccddd

    sb4.insert(12, "eee").append("fff").reverse();
    System.out.println(sb4);// fffeeedddcccbbbaaa

    sb4.deleteCharAt(0);
    System.out.println(sb4);// ffeeedddcccbbbaaa

    sb4.setCharAt(1, 'g');
    System.out.println(sb4);// fgeeedddcccbbbaaa

    sb4.replace(2, 5, "hij");
    System.out.println(sb4);// fghijdddcccbbbaaa

    String result4 = sb4.toString().replace("d", "k");
    System.out.println(result4);// fghijkkkcccbbbaaa
    System.out.println(sb4);// fghijdddcccbbbaaa (sb4 remain unchange since toString() -> leave sb4 address)

    StringBuilder sb5 = new StringBuilder("mmm");
    StringBuilder sb6 = new StringBuilder("mmm");
    if (sb5.compareTo(sb6)==0) {// "equals" method unwork in such case
      System.out.println("They are equal.");
    }

    sb5.append("zzz");
    System.out.println(sb5);

  }
}
