package localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.Random;

// Java Project/File: Auto-imported -> java.lang(Math)
// JDK -> java.time, java.util

public class DemoDate {
  public static void main(String[] args) {
    LocalDate day = LocalDate.of(2023, 12, 1);
    System.out.println(day.toString());// 2023-12-01

    LocalDate day2 = LocalDate.parse("2023-12-01");
    System.out.println(day2.toString());// 2023-12-01

    System.out.println(day == day2);// false
    System.out.println(day.isEqual(day2));// true
    System.out.println(day.compareTo(day2));// 0

    System.out.println(day.isAfter(LocalDate.of(2023, 11, 30)));// true
    System.out.println(day.isBefore(day2));// false

    int year = day.getYear();
    Month month = day.getMonth();
    System.out.println(month.length(false));// 31
    System.out.println(Month.of(2).length(false));// 28

    LocalDateTime t1 = day.atTime(14,43,35);
    System.out.println(t1);

    Year y1 = Year.of(2024);
    System.out.println(y1.isLeap());// true

    System.out.println(day.getDayOfWeek().toString());// FRIDAY

    int random = new Random().nextInt(3);
    System.out.println(random);// 0~2

    System.out.println(day.plusDays(50).toString());// 2024-01-20
    LocalDate day3 = day.plusMonths(2);
    LocalDate day4 = day.plusYears(4);
    System.out.println(day4);// 2027-12-01

    LocalDate today = LocalDate.now();
    System.out.println(today);

    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

  }
}
