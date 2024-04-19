import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
  
  private double price;
  private String author;

  public Book(double price, String author){
    this.price = price;
    this.author = author;
  }

  public double getPrice(){
    return this.price;
  }

  public String getAuthor(){
    return this.author;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Book))
    return false;
    Book book = (Book) o;
    return Objects.equals(this.price, book.getPrice())
    && Objects.equals(this.author, book.getAuthor());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.price, this.author);
  }

  @Override
  public String toString(){
    return "Book("
    + "price = " + this.price
    + ", author = " + this.author
    + ")";
  }

  public static void main(String[] args) {
    // Book Array
    Book [] books = new Book[2];
    books [0] = new Book(10.2d, "Vincent");
    books [1] = new Book(8.4d, "Jenny");
    System.out.println(books[0].getAuthor());

    // ArrayList
    ArrayList<Book> books2 = new ArrayList<>(); 

    books2.add(new Book(3.4d, "Sally"));
    books2.add(new Book(5.4d, "Vincent"));
    books2.add(new Book(7.2d, "Tommy"));
    books2.add(new Book(5.4d, "Vincent"));
    System.out.println(books2.size()); // 3
    books2.add(new Book(20.2d, "Kelvin"));
    System.out.println(books2.size()); // 4

    System.out.println(books2.contains(new Book(5.4d, "Vincent"))); // true

    // Remove
    books2.remove(new Book(5.4, "Vincent")); // only remove the first match book
    System.out.println(books2.size()); // 4
    System.out.println(books2.toString());

    // ArrayList has ordering
    // Remove by index
    books2.remove(0);
    System.out.println(books2.size()); // 3
    System.out.println(books2.toString());

    books2.set(0, new Book(11.2, "John"));
    System.out.println(books2.size()); // 3
    System.out.println(books2.toString());

    books2.isEmpty(); // false

    System.out.println(books2.subList(1, 3)); // end index-1
    System.out.println(books2.get(0)); // Book(price = 11.2, author = John)
    
    books2.clear();
    System.out.println(books2.size()); // 0
    System.out.println(books2.toString()); // empty

    // Initialize with objects
    List<Book> books3 = new ArrayList<>(
      List.of(new Book(10.3, "Katie"), new Book(20.3, "Vincent")));
    List<Book> books4 = 
      List.of(new Book(10.3, "Katie"), new Book(20.3, "Vincent"));

    System.out.println(books3.size() == books4.size()); // true

    books3.add(new Book(10.9, "Cherry"));
    // books4.add(new Book(10.9, "Oscar")); // java.lang.UnsupportedOperationException
    
    for (Book b : books4){
      System.out.println(b.getAuthor() + " " + b.getPrice());
    }
  }
}
