// "String" is a keyword in Java.
// in T: javac name.java first, then java name
// Runtime: bytecode -> machine code
//String(字串符) can save more than 1 charater while others only save 1 charater
//short cut: sysout=System.out.println()

public class String1 {
  public static void main(String[] args) {
    int x1=0;
    char c1='s';

    String y="Hi World";
    String s1="1";
    String s2="";//allow empty string
    
    //Tool for String

    //length()
    int lengthOfY=y.length();//12
    System.out.println(lengthOfY);

    //charAt()
    char charater=y.charAt(2);//"i"
    System.out.println(y.charAt(3));

    //equals()
    String s3="Hi";
    String s4="Hi";
    boolean isS3EqualsToS4=s3.equals(s4);//If S3=S4, True, False
    System.out.println(isS3EqualsToS4);

    //Concat, 字串符只可以相加
    String s5=s3+s4;
    System.out.println(s5);
    System.out.println(s3+s4);//=s5:HiHi
    System.out.println(s5+10+"a"+0.5+true);

    String j1="Hi"+true;
    System.out.println(j1);
    //String j1=10+10;//int+int<>String

    String s6="World";
    s6+="!";
    System.out.println(s6);//World!


  }
}
