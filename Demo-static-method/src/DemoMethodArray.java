import java.util.Arrays;

public class DemoMethodArray {
  public static void main(String[] args){
    double[] prices = new double[]{2.0, 3.2, 5.1};
    int[] quantities = new int[]{2, 4, 5};

    double totalAmount = total(prices, quantities);
    System.out.println(totalAmount);

    //Call another file
    double amount = DemoMethodArray.total(prices, quantities);
    System.out.println(ABC.hello());//hello

    String old="he ll o";
    String result=trimSpace(old);
    trimSpace3(old);//pass by value
    System.out.println(old);//he ll o -> unchanged
    System.out.println(result);//hello -> changed

    String[] ss=new String[]{"a a a  ","bb b"};
    String[] ss2=trimSpace4(ss);
    System.out.println(Arrays.toString(ss2));

    //pass by reference example
    String[] mm=new String[]{"a a a  ","bb b"};
    trimSpace2(mm);
    System.out.println(Arrays.toString(mm));
  }

  public static Integer sum(Integer x, Integer y){//pass by vaule
    return x+y;//int+int -> int (autobox)
  }

  public static String trimSpace(String s){//pass by value(a copy of the original string object)
    return s.replace(" ","");
  }

  public static void trimSpace3(String s){//pass by value -> the trimSpace3 will no change
    s.replace(" ","");
  }

  //return {"aaa", "bbb"}
  public static String[] trimSpace4(String[] ss){//pass by reference(address)
    String[] strings = new String[ss.length];
    for(int i=0; i<strings.length; i++){
      strings[i]=ss[i].replace(" ","");
    }
    return strings;//returning string array object address
  }

  //pass by reference example, no need to return if call name -> trimSpace2 
  public static void trimSpace2(String[] v){//"trimSpace2" is the key, "v" is just a word
    for(int i=0; i<v.length; i++){
      v[i]=v[i].replace(" ","");
    }
  }

  //Method: totalAmount -> call subTotal()
  public static double total(double[] prices, int[] quantities){
    double totalAmount=0;
    for(int i=0; i<3; i++){
      totalAmount += subTotal(prices[i], quantities[i]);
    }
    return totalAmount;
  }

  //Method: subTotal(double price, int quantity)
  public static double subTotal(double price, int quantity){
    return price*quantity;//bug
  }


}