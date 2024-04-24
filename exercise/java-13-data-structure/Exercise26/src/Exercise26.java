import java.util.HashMap;
import java.util.Map;

/**
 * In this exercise, try to create an enum Fruit, with two fields, name (String) and price (int).
 * Revise foodTable to HashMap<Integer, Fruit>.
 * 
 * Expected Output: 
 * Before change: 
 * 1 = Apple 
 * 3 = Strawberry
 * 
 * After change: 
 * 1 = APPLE, price = 20 
 * 3 = STRAWBERRY, price = 70
 */
class Exercise26 {
    // finite number of instances

    enum Fruit {
        // code here
        APPLE("Apple", 20),
        STRAWBERRY("Strawberry", 70),
        ORANGE("Orange", 30);

        private int price;
    
        private Fruit(String name, int price){
            this.price = price;
        }

        public int getPrice(){
            return this.price;
        }
    }

    public static void main(String[] args) {
        // initialize a HashMap
        HashMap<Integer, Fruit> foodTable = new HashMap<>();

        // Add elements using put method
        foodTable.put(1, Fruit.APPLE);
        foodTable.put(3, Fruit.STRAWBERRY);
        foodTable.put(2, Fruit.ORANGE);

        // Remove elements 2
        foodTable.remove(2);

        // Iterate the map using
        // for-each loop
        // Iterating HashMap through for loop
        for (Map.Entry<Integer, Fruit> set : foodTable.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue() + ", price = " + set.getValue().getPrice());
        }
    }
}
