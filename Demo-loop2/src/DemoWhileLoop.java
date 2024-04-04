import java.util.Arrays;

public class DemoWhileLoop {
  public static void main(String[] args) {

    //1. initial value
    //2. continue condition
    //3. incremental / decremental

    int[]arr=new int[]{2,10,3,-1};
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);//print the value
    }

    //for-each loop
    //if you want to loop through all element from the beignning, should use for-each
    for (int i:arr){
      System.out.println(i);//print the value
    }

    String[] strings=new String[]{"abc", "def"};
    for (String str:strings){
      System.out.println(str);//print the value
    }

    //while loop
    int count=0;
    while (count<strings.length) {
      System.out.println(strings[count]);
      count++;
    }
    //step 1: count = 0 < 2 -> print "abc"; count++
    //step 2: count = 1 < 2 -> print "def"; count++
    //step 3: count = 2 !< 2 -> quit the loop

    // infinite loop
    // byte b=0;
    // while (b<128) {
    //   b++;
    // }

      int a=1023;
      //Targe: int array[1,0,2,3]
      int c = 1023/10; //102
      int d = 1023%10; //3
      int copy = a;
      count = 0;
      while (copy>0) {
        copy/=10;
        count++;
      }
      int[] result = new int[count];
      copy=a;
      int index=count-1;
      while (copy!=0) {
        result[index]=copy%10;
        copy/=10;
        index--;
      }
      System.out.println(Arrays.toString(result));

      //do-while
      count=0;
      do{
        System.out.println("hi");
        count++;
      } while(count<3);


  }
}