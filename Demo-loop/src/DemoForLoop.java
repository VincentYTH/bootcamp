public class DemoForLoop {
  public static void main(String[] args) {

    int x=2;
    x=x*x;//2*2=4
    x*=x;//-> x*x//4*2=4


    //for (initialization; continue condition; incremental rule)
    for(int i=0; i<3; i++ ){
      //Step 1: int 1=0; 
      //Step 2: i<3 ? -> Yes; 
      //Step 3: Print Hi; 
      //Step 4: i++ -> 1; 
      //Step 5: i<3? -> Yes;
      //Step 6: Print Hi again;
      //...
      //Step 7: i++ -> 3;
      //Step 8: i<3? -> No -> Stop Loop

      //Never to re-assign value to i wihtin the loop -> i++;
      System.out.print("Hi"+i);
    }

    for(int i1=4; i1>=0; i1--){
      System.out.print("HI~"+i1);
    }

    //print out: 1,3,5,7,9 **************
    for(int i2=1; i2<=9; i2+=2){
      System.out.print(i2+" ");
    }

    for(int i3=0; i3<10; i3++){
      if (i3%2==1) {
        System.out.print(i3+"  ");
      }
    }

    //print out: aceg
    String s="abcdefg";
    for(int i4=0; i4<s.length(); i4++){//盡量保持for loop全部一致
      if (i4%2==0) {
        System.out.print(" "+s.charAt(i4));
      }
    }

    //if cd -> print "true" ; s="abcdefg"
    String pattern = "cd";
    for(int i5=0; i5<s.length(); i5++){
      
    }

    //55=1+2+3+4+......+10 -> print out 55
    int max=10;
    int min=1;
    int R1=0;
    for(int i6=min; i6<=max; i6++){
      R1+=i6;//-> R1=i6+R1//1+0,2+1,3+3,6+4,10+5,15+6,21+7,28+8,36+9,45+10=55
    }
    System.out.println(R1);

    //sum up all even numbers
    int R2=0;
    for(int i7=min; i7<=max; i7++){
      if (i7%2==0) {
        R2+=i7;
      }
    }
    System.out.println(R2);

    //Count the no. of 'l' -> 3
    String str="hello world";
    int R3=0;
    for(int i8=0; i8<str.length(); i8++){
      if (str.charAt(i8) == 'l') {
        R3++;
      }
    }
    System.out.println(R3);

    //sum up all ood numbers, and minus all even numbers -> 1-2+3-4+5...-10 = -5
    int R4=0;
    for(int i9=min; i9<=max; i9++){
      if (i9%2!=0) {
        R4+=i9;
      }else{
        R4-=i9;
      }
    }
    System.out.println(R4);






  }
}
