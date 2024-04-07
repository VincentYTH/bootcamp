public class DemoWrapper {
    public static void main(String[] args){

        int x=1;//+,-,*,/,%
        Integer x2=1;//Integer wrapper class -> object (i.e.:String.class -> String Object)
        Integer x3=new Integer("1");

        Byte b=new Byte("12");
        Short s=new Short("250");
        Long l=new Long(10);

        Float f=new Float("25.2");
        Double d=new Double(5.56);

        Boolean b2=new Boolean(true);
        Character c=new Character('!'); 

        if (x2.equals(1)) {
            System.out.println("x2=1");
        }

        if (x2==1) {
            System.out.println("x2=1");;
        }

        x2=128;
        if (x2==128) {
            System.out.println("x2=128");
        }

        //Integer
        //-128~127 are default setting object by Java
        Integer num1=Integer.valueOf(127);//valueOf() -> "new" a Integer Object
        Integer num2=Integer.valueOf(127);
        //"==" is checking if they are same object
        System.out.println(num1==num2);//true
        //"equals()" is checking if they are with the same value
        System.out.println(num1.equals(num2));//true

        Integer num5=new Integer(127);//force to create a new object
        System.out.println(num1==num5);//false

        Integer num3=Integer.valueOf(128);
        Integer num4=Integer.valueOf(128);
        System.out.println(num3==num4);//false
        System.out.println(num3.equals(num4));//true

        //String
        //same value of Strings will be setted in same object by Java
        String str="hello";
        String str2="hello";

        String str3=new String("hello");//force to create a new object
        String str4=String.valueOf("hello");// => String str="hello";

        //"==" is checking if they are same object
        System.out.println(str==str2);//true
        System.out.println(str==str3);//false
        System.out.println(str.equals(str3));//true
        System.out.println(str==str4);//true


        Double d2=1.0;
        Double d3=1.0;
        Double d4=Double.valueOf(1.0);
        System.out.println(d2==d3);//false
        System.out.println(d2==d4);//false
        System.out.println(d2.equals(d4));//true
        System.out.println(d2.compareTo(d3));//0

        //17 Types(8*2+String) + array

        Integer i1=3;// 3 (int value) -> Integer Object with value 3 -> auto-box
        int i2=i1;// i1(Integer Object) -> unbox
        Character c2='c';//auto-box
        char c3=c2;//unbox

        Integer i3=10;
        long l4=i3;// Integer -> int(unbox) -> long(upcast)
        // short s4=i3; Cannot downcast

        int i5=12;
        // Long l5=i5;Upcast Cannot auto-box
        Long L5=(long)i5;

        //Float.value of()
        Float f2=Float.valueOf("1.0");
        //f2.compareTo(...) -> 0,-1,1
        //f2.equals(...) -> true,false

    }
}