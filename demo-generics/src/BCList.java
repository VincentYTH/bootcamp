public class BCList<T, U> {
  private T data1;
  private U data2;

  public BCList(T data1, U data2){
    this.data1 = data1;
    this.data2 = data2;
  }

  public T getDataT(){
    return this.data1;
  }

  public U getDataU(){
    return this.data2;
  }

  public static <T extends Number> double sum(T number1, T number2){ // this "T" has no relationship with line 1's "T" in static method
  System.out.println(number1.getClass());
  System.out.println(number2.getClass());
    return number1.doubleValue() + number2.doubleValue();
  }

  public static void main(String[] args) {
    BCList<String, Integer> bclist = new BCList<>("Hello", 10);
    System.out.println(bclist.getDataT());
    System.out.println(bclist.getDataU());
    
    // T & U can be same type
    BCList<String, String> bclist2 = new BCList<>("Hello", "abc");

    // "public class BCList<T, T>" -> if defined as left, two attributes must be same type

    System.out.println(sum(Integer.valueOf(10), Long.valueOf(13)));

    // int -> Integer (autobox)
    // integer -> int (unbox)
    // int -> long (upcast)
    // long -> int (downcast -> overflow)

    // Wrapper Class cannot be coverted between eath others
    // Integer -> Long (no auto or direct relationship)
    // Long -> Integer (no auto or direct relationship)
  }
}
