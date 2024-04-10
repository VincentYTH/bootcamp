package localdate;

import java.time.LocalDate;

public class HKLocalDate {
  
  private LocalDate[] holidays;

  private LocalDate date;

  public HKLocalDate(int year, int month, int day){// new HKLocalDate(2020,1,1);
    this.date = LocalDate.of(year, month, day);
  }

  public HKLocalDate tomorrow(){
    this.date = this.date.plusDays(1);
    return this;
  }

  public HKLocalDate T3(){
    this.date = this.date.plusDays(3);
    return this;
  }

  public static HKLocalDate now(){
    int year = LocalDate.now().getYear();
    int month = LocalDate.now().getMonthValue();
    int day = LocalDate.now().getDayOfMonth();
    return new HKLocalDate(year, month, day);
  }

  public String toString(){
    return this.date.getYear() + "~"//
    + this.date.getMonthValue() + "~"//
    + this.date.getDayOfMonth();
  }

  public static void main(String[] args) {
    HKLocalDate day = new HKLocalDate(2024, 3, 25);
    System.out.println(day.tomorrow().toString());// 2024-03-26
    System.out.println(HKLocalDate.now().toString());// 2024~4~10
    System.out.println(HKLocalDate.now().T3().toString());// 2024~4~13
  }

}
