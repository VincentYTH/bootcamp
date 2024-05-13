import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
  private String name;
  private String department;
  private double salary;

  public Employee(String name, String department, double salary){
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public String getName(){
    return this.name;
  }

  public String getDept(){
    return this.department;
  }

  public double getSalary(){
    return this.salary;
  }

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Alice", "HR", 60000));
    employees.add(new Employee("Bob", "IT", 45000));
    employees.add(new Employee("Carol", "Finance", 75000));
    employees.add(new Employee("David", "HR", 48000));
    employees.add(new Employee("Jennny", "IT", 60000));

    // Stream
    // 1. filter salary >= 60000 and IT Dept.
    // 2. map the name of the result set to a list of String

    List<String> result = employees
    .stream()
    .filter(e -> e.getSalary() >= 60000 && "IT".equals(e.getDept()))
    .map(e -> e.getName())
    .collect(Collectors.toList());
    System.out.println(result); // [Jennny]

  }
}
