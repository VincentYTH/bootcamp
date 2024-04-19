public class SmallCat extends Cat {

  public SmallCat(int age, String name, double weight){
    super(age, name, weight);
  }

  public static void main(String[] args) {
    SmallCat sc = new SmallCat(3, "Joe", 11);// Cat()
    sc.setName("mabel");
    System.out.println(sc.getAge());
    System.out.println(sc.getName());
  }
}
