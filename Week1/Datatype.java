public class Datatype {
  public static void main(String[] args) {
    // variable 變量
    // integer 整數
    // double函數 加減乘除數會有精度損失
    int x=66;
    int age=18;
    System.out.println(x);//66
    x=200;
    System.out.println(x);//200
    System.out.println(age);//18

    int y=-20;
    y=x*(age-8);
    System.out.println(y);//200*18-8=2000

    //x,y,age 200 2000 18
    int sum=x+y+age;
    System.out.println(sum);//2218

    int price=8;
    int qty=10;
    int total=price*qty;
    System.out.println(total);//80

    int price2=10;
    int qty2=4;
    int total2=price2*qty2;//40

    //CamlCase(2 noun, first a, SECOND A)
    int averagePrice=(total+total2)/(qty+qty2);
    System.out.println(averagePrice);//(80+40)/(10+4)=8.5=8 because of int

    int a=1;
    int b=4;
    int c=a/b;//0.25=>0
    System.out.println(c);//0

    double m=3.4;
    double n=2;
    double sumf=m*n;
    System.out.println(sumf);//3.4*2=6.8

    double k6=0.1+0.2;
    double k7=0.2+0.3;
    System.out.println(k6);//0.300004??
    System.out.println(k7);//0.5

    int u=50%3;//%：計算餘數
    System.out.println(u);//50/3=18..2

    int h;//declaration
    h=10;
    System.out.println(h);

    byte b1=10; //must be integrate
    //byte=128 > compile time error

    short s1=10; //between -32768 to 32767 , must be integrate
    System.out.println(s1);

    //Conversion
    int i1=100;
    long l1=i1+10;//i1+10 -> int value -> long variable
    System.out.println(l1);//

    //Java ensures type security on compile time
    byte b2=5;
    short s2=b2;
    
    double d3=i1;//int -> double ok
    double d4=10.2;
    //i1=d4// double -> int not ok

    float f3=i1; //int -> float ok
    float f4=10.2f;// only 10.2 is a double(most high) value by default, need add "f" suffix
    //i1=f4;//float -> int not ok

    double d5=10.4;//10.4 is a double value by default
    double d6=10.4d;//Assigned a double value

    int r1=10;//default int
    byte b3=4;//default byte, java will help check the value if it is in range, then int->byte
    //byte b3=r1;//security problem -> error

    long l5=i1;//int->long
    long l6=5;//5 is an int value by default
    long l7=10000;//10000 is an int value
    long l8=10000L;//10000 is a long value by L
    long l9=2200000000L;//int out of range, need add L suffix

    //char
    char c1='a';//''for char using, only allow single character(Xaa)
    char c2='9';//below 10 char
    char c3=' ';//not allow ''
    //char c0;//compile time error:c0=''

    //boolean
    boolean T=true;
    boolean F=false;

    //keyword: true, int, long, class, public, static... But add sb. with suffix is allowed
    
    //int h1=10+300L;//int value + long value -> 310 long value. not compell with int(error)
    long h2=10+300L;//int value + long value -> 310 long value.

    //short s1=int1;//downgrate

    byte b10=10;
    byte b11=11;
    short s10=(short) (b10+b11);
    System.out.println(s10);
  }
}