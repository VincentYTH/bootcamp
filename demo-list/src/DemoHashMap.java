import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // John 13, Vincent 18
    HashMap<String, Integer> mapper = new HashMap<>(); // Left hand side: Key, right hand side: Value
    mapper.put("John", Integer.valueOf(13)); // put an "entry" into map
    mapper.put("Vincent", 18);
    // No ordering
    // Get Value by Key, cannot get Key by Value
    System.out.println(mapper.get("John")); // 13
    System.out.println(mapper.get("Vincent")); // 18
    // for-each loop
     for (Map.Entry<String, Integer> m : mapper.entrySet()){
      System.out.println(m.getKey() + " " + m.getValue());
     }

    // Key cannot be duplicated in a HashMap
    // put -> update
    mapper.put("Vincent", 20);
    System.out.println(mapper.get("Vincent")); // 20

    mapper.put("Jenny", 24);
    // sum up all Integers in the map
    int sum = 0;
    for (Map.Entry<String, Integer> m : mapper.entrySet()){
      sum += m.getValue();
    }
    System.out.println(sum); // 13+20+24 = 57

    HashMap<Customer, Integer> ageMap = new HashMap<>();
    ageMap.put(new Customer("John"), 13);
    ageMap.put(new Customer("John"), 17);
    System.out.println(ageMap.get(new Customer("John"))); // null -> need override Hashcode for "Customer" class
    System.out.println(ageMap.size()); // 2

    //
    HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
    // John -> order 1: 100, order 2: 250
    // Vincent -> order 1: 200, order 2: 20, order 3: 88
    // return totalOrderAmount = 1658

    ArrayList<Order> Orders1 = new ArrayList<>();
    Orders1.add(new Order(100));
    Orders1.add(new Order(250));
    orderMap.put(new Customer("John"), Orders1);

    ArrayList<Order> Orders2 = new ArrayList<>();
    Orders2.add(new Order(1200));
    Orders2.add(new Order(20));
    Orders2.add(new Order(88));
    orderMap.put(new Customer("Vincent"), Orders2);
    
    int totalOrderAmount = 0;
    // for (Map.Entry<Customer, ArrayList<Order>> order : orderMap.entrySet()){
    //   for (Order o : order.getValue()){
    //     totalOrderAmount += o.getAmount();
    //   }
    // }
    for (ArrayList<Order> orderList: orderMap.values()){
      for (Order o : orderList){
        totalOrderAmount += o.getAmount();
      }
    }
    System.out.println("totalOrderAmount = " + totalOrderAmount); // totalOrderAmount = 1658

    for (Customer customer : orderMap.keySet()){
      System.out.println("Customer = " + customer.getName());
    }

    // containsKey && containsValue
    System.out.println(orderMap.containsKey(new Customer("Vincent"))); // false -> need override Hashcode for "Customer" class

    // Conclusion:
    // 1. If they are different objects -> we can treat them as same thing (equals(), hashCode())
    // 2. If they are Same object -> all the values inside the object are same

    ArrayList<Order> Orders3 = Orders1;
    orderMap.put(new Customer("Sally"), Orders3); // same array objects with John

    HashMap<String, ArrayList<Order>> example1 = new HashMap<>();
    HashMap<Integer, ArrayList<Order>> example2 = new HashMap<>();

    orderMap.remove(new Customer("Vincent"));
    System.out.println(orderMap);

  }
}
