public class DemoString {
  public static void main(String[] args) {

    String s="hello";
    String s2="";
    String s3=" ";
    String s4="      ";

    //is Empty() & is Blank()
    boolean isEmptyResult = s2.isEmpty();//true
    System.out.println(isEmptyResult);
    System.out.println(s.isEmpty());//false
    System.out.println(s3.isEmpty());//false
    System.out.println(s3.isBlank());//true
    System.out.println(s4.isBlank());//true

    //substring()
    String result=s.substring(0,3);//hel -> 0 1 2
    System.out.println(result);

    result=s.substring(2);//llo -> 2 3 4
    System.out.println(result);

    //toLowercase()
    System.out.println("HeLLo".toLowerCase());//hello

    //toUppercase()
    System.out.println("Hello".toUpperCase());//HELLO

    //contains()
    System.out.println(s.contains("ll"));//true

    //startsWith()
    System.out.println(s.startsWith("he"));//true

    //endsWith()
    System.out.println(s.endsWith("lo"));//true

    //replace()
    String after = s.replace("l", "z");
    System.out.println(after);//hezzo

    //trim() -> remove the space at the beginning and the end of the string
    String s5="   hello   !wo rld  ";
    System.out.println(s5.trim());//hello   !wo rld
    System.out.println(s5.replace(" ", ""));//hello!world

    //indexOf()
    char c=s.charAt(2);//'l'
    System.out.println(s.indexOf('l'));//2; the index of the first mathcing character
    System.out.println(s.indexOf('z'));//-1
    System.out.println(s.lastIndexOf('l'));//3; the index of the last mathcing character
    System.out.println(s.indexOf("ll"));//2

    //equalsIgnoreCase()
    System.out.println("hello".equals("HELLO"));//false
    System.out.println("hello".equalsIgnoreCase("HELLO"));//true
    System.out.println("hello".equalsIgnoreCase("HELLO "));//false

  }
}