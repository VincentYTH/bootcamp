package com.bootcamp.demo2403;

import lombok.Data;
import lombok.NonNull;

@Data // @RequiredArgsConstructor, @ToString, @EqualsANDHashCode, @Getter, @Setter

public class Book {
  @NonNull
  private String name;
  @NonNull
  private Color color;

  public static void main(String[] args) {
    Book b1 = new Book("Love", Color.YELLOW) ;
    b1.setName("Peace");
    b1.setColor(Color.RED);
    System.out.println(b1.toString());
    System.out.println(b1.getName() + " " + b1.getColor());
    Book b2 = new Book("War", Color.RED);
    b2.setName("Peace");
    b2.setColor(Color.RED);
    System.out.println(b1.equals(b2)); // true
  }
}
