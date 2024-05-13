import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

  public static void main(String[] args) {

    // Practice from GPT

    // ArrayList
    ArrayList<String> name = new ArrayList<>();
    name.add("Joe Chan");
    name.add("John Hui");
    name.add("Ray Cheng");
    System.out.println(name.get(0));
    System.out.println(name.get(1));
    System.out.println(name.get(2));

    ArrayList<Integer> integersGroup = new ArrayList<>();
    integersGroup.add(10);
    integersGroup.add(20);
    integersGroup.add(30);
    integersGroup.add(40);
    integersGroup.add(50);
    int sumIntegers = 0;
    for (Integer integer : integersGroup){
      sumIntegers += integer;
    }
    System.out.println("Sum of all Integers: " + sumIntegers);

    ArrayList<String> groupStrings = new ArrayList<>();
    groupStrings.add("abc");
    groupStrings.add("def");
    groupStrings.add("ghi");
    groupStrings.add("def");
    groupStrings.add("abc");
    HashSet<String> removeDuplicated = new HashSet<>(groupStrings);
    System.out.println("After remove duplicated: " + removeDuplicated);


    // HashSet
    HashSet<Color> colors = new HashSet<>();
    colors.add(Color.RED);
    colors.add(Color.BLUE);
    colors.add(Color.ORANGE);
    colors.add(Color.WHITE);
    colors.add(Color.BLACK);
    System.out.println("Colors: " + colors);

    HashSet<Integer> integersGroup1 = new HashSet<>();
    HashSet<Integer> integersGroup2 = new HashSet<>();
    integersGroup1.add(1);
    integersGroup1.add(2);
    integersGroup1.add(3);
    integersGroup1.add(4);
    integersGroup2.add(4);
    integersGroup2.add(2);
    integersGroup2.add(5);
    integersGroup2.add(6);

    // Union
    HashSet<Integer> integersUnion = new HashSet<>();
    integersUnion.addAll(integersGroup1);
    integersUnion.addAll(integersGroup2);
    System.out.println("The Union of integers group 1 and 2: " + integersUnion);

    // Intersection
    HashSet<Integer> integersIntersection = new HashSet<>(integersGroup1);
    integersIntersection.retainAll(integersGroup2);
    System.out.println("The Intersection of integers group 1 and 2: " + integersIntersection);

    ArrayList<String> grouStrings2 = new ArrayList<>();
    grouStrings2.add("ab");
    grouStrings2.add("cd");
    grouStrings2.add("ed");
    grouStrings2.add("ab");
    grouStrings2.add("dc");
    grouStrings2.add("cd");
    HashSet<String> removeDuplicated2 = new HashSet<>(grouStrings2);
    System.out.println("Group strings remove duplicated result: " + removeDuplicated2);


    // HashMap
    HashMap<String, String> nations = new HashMap<>();
    nations.put("CHINA", "BEIJING");
    nations.put("UK", "LONDON");
    nations.put("FRANCE", "PARIS");
    nations.put("JAPAN", "TOKYO");
    System.err.println("The nations: " + nations);

    HashMap<String, Integer> score = new HashMap<>();
    score.put("Sally", 60);
    score.put("Ray", 70);
    score.put("John", 80);
    score.put("Abby", 90);
    int maxScore = 0;
    String maxStudent = "";
    for (Map.Entry<String, Integer> s : score.entrySet()){
      if (s.getValue() > maxScore) {
        maxScore = Math.max(maxScore, s.getValue());
        maxStudent = s.getKey();
      }
    }
    System.out.println("The highest score is " + maxStudent);

    HashMap<String, Double> products = new HashMap<>();
    products.put("A4", 0.5);
    products.put("A3", 0.8);
    products.put("A2", 1.6);
    products.put("A4WithColor", 3.0);
    double sum = 0;
    for (Map.Entry<String, Double> p : products.entrySet()){
      sum += p.getValue();
    }
    System.out.println("The total prices is " + sum);


    List<Integer> integers = new ArrayList<>();
    integers.add(2);
    integers.add(2);
    integers.add(2);
    integers.add(3);
    integers.add(3);
    integers.add(1);
    System.out.println(integers.size()); // 6
    System.out.println(getDuplicated(integers)); // 2, 3
  }

  public static Set<Integer> getDuplicated(List<Integer> integers){ // 2,2,2,3,3,1 -> 2,3
    Set<Integer> results = new HashSet<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer x : integers){
      if (map.containsKey(x)) {
        results.add(x);
        continue;
      }
      map.put(x, null);
    }
    return results;
  }

}
