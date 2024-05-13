package cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat extends Animal{

  // 1. <T extends Cat> void addCat3(List<T> cats) -> List<Cat>

  // 2. void addCat(List< ? extends Cat> cats) -> List<Cat> or List<RedCat>

  public static <T extends Cat> void addCat4(List<T> cats){} // Cat and Redcat are avaialble

  public static void addCat(List<? super Cat> cats){ // super means Cat or above
    cats.add(new Cat());
    cats.add(new RedCat());
  }
  
  public static void addCat2(List<Cat> cats){

  }

  public static <T extends Cat> void addCat3(List<T> cats){

  }

  public static void main(String[] args) {
    addCat(new ArrayList<>(List.of(new Animal(), new Animal())));
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(), new RedCat())));
    
    // addCat2(new ArrayList<>(List.of(new Animal(), new Animal()))); // on below
    addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat())));

    List<Cat> cats = new LinkedList<>();
    cats.add(new RedCat());
    cats.add(new Cat());
    addCat4(cats);

    List<RedCat> redCats = new LinkedList<>();
    addCat4(redCats);

    List<Animal> animals = new LinkedList<>();
    // addCat4(animals); // cannot
  }
}
