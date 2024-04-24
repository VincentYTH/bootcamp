import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Staff {

  private String name;

  public Staff (String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Staff))
    return false;
    Staff staff = (Staff) o;
    return Objects.equals(this.name, staff.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

  @Override
  public String toString(){
    return "Staff("
    + "name = " + this.name
    + ")";
  }
  
  public static void main(String[] args) {
    // Set is a data structure that ensures no duplicated elements is stored
    // Set has no ordering
    HashSet<Staff> staffs = new HashSet<>();

    staffs.add(new Staff("Vincent"));
    staffs.add(new Staff("Oscar"));
    System.out.println(staffs.size());
    System.out.println(staffs.isEmpty());

    // add -> false
    System.out.println(staffs.add(new Staff("Vincent"))); // false

    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("hello");
    System.out.println(strings.size()); // 1

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(2);
    integers.add(4);
    integers.add(2);
    integers.add(4);
    integers.add(24);
    HashSet<Integer> newIntegers = new HashSet<>();
    // for (int i = 0; i < integers.size(); i++){
    //   newIntegers.add(integers.get(i));
    // }
    for (Integer integer : integers){
      newIntegers.add(integer);
    }
    System.out.println(newIntegers.toString()); // [2, 4, 24]

    newIntegers.remove(Integer.valueOf(24));
    System.out.println(newIntegers.toString()); // [2, 4]
    System.out.println(newIntegers.contains(Integer.valueOf(4))); // true
    
  }
}
