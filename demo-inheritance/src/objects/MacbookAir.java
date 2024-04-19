package objects;

import java.util.Arrays;
import java.util.Objects;

public class MacbookAir {
  
  private double inch;
  private String cpu;
  private int ram;
  private String disk;
  private Color color;

  public MacbookAir(double inch, String cpu, int ram, String disk, Color color){
    this.inch = inch;
    this.cpu = cpu;
    this.ram = ram;
    this.disk = disk;
    this.color = color;
  }

  public double getInch(){
    return this.inch;
  }

  public String getCpu(){
    return this.cpu;
  }

  public int getRam(){
    return this.ram;
  }

  public String getDisk(){
    return this.disk;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof MacbookAir))
    return false;
    MacbookAir macbook = (MacbookAir) obj;
    // return this.inch == macbook.getInch() &&//
    // this.cpu.equals(macbook.getCpu()) &&//
    // this.ram == macbook.getRam() &&//
    // this.disk.equals(macbook.getDisk()) &&//
    // this.color == macbook.getColor();
    return Objects.equals(this.inch, macbook.getInch())
    && Objects.equals(this.cpu, macbook.getCpu())
    && Objects.equals(this.ram, macbook.getRam())
    && Objects.equals(this.disk, macbook.getDisk())
    && Objects.equals(this.color, macbook.getColor());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.inch, this.cpu, this.ram, this.disk, this.color);
  }
  
  public static void main(String[] args) {
    MacbookAir ma1 = new MacbookAir(15.0, "M2", 16, "ABC", Color.BLACK);
    MacbookAir ma2 = new MacbookAir(15.0, "M2", 16, "ABC", Color.BLACK);
    System.out.println(ma1.equals(ma2)); // true

    System.out.println(ma1.hashCode()); // -1476819452
    System.out.println(ma2.hashCode()); // -1476819452
    
    System.out.println(System.identityHashCode(ma1)); // 1392838282
    System.out.println(System.identityHashCode(ma2)); // 523429237
    
    // Sorting
    int[] arr = new int[] {10, 5, 4, 2};
    Arrays.sort(arr); // merge sort, ascending sorting
    System.out.println(Arrays.toString(arr)); // [2, 4, 5, 10]

    MacbookAir[] arr2 = new MacbookAir[] { //
      new MacbookAir(13.0, "M1", 14, "240GB", Color.RED), //
      new MacbookAir(15.0, "M2", 16, "1TB", Color.BLACK)};
    System.out.println(Arrays.toString(arr2));
      Integer.bitCount(2);
  }
}
