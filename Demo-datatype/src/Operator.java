public class Operator {
  public static void main(String[] args){

    //increment
    int x=1;
    x=x+1;//2
    x=x+1;//3

    int y=1;
    y++;//2
    y++;//3
    ++y;//4
    y+=1;//5:"+="->itself + 1
    System.out.println(y);

    int e=10;
    e--;//9
    --e;//8
    e-=1;//7
    e-=2;//5
    e=e-1;//4
    System.out.println(e);

    e=5;

    int predecrement=--e;//predecrement=5 原先返回值再運算
    System.out.println(predecrement);//4
    System.out.println(e);//4

    int postdecrement=e--;//postdecrement=4 運算值再運算
    System.out.println(postdecrement);//4
    System.out.println(e);//3

  }  
}
