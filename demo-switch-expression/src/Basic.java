public class Basic {
  public static void main(String[] args) {
    Weekday day = Weekday.MONDAY;
    switch (day) {
      case MONDAY:
        System.out.println("Monday");
        break;
      case TUESDAY:
        System.out.println("Tuesday");
        break;
      case WEDNESDAY:
        System.out.println("Wednesday");
        break;
      case THURDAY:
        System.out.println("Thurday");
        break;
      case FRIDAY:
        System.out.println("Firday");
        break;
      default:
        break;
    }

    // After Java 14
    int value = switch (day) {
      case MONDAY, TUESDAY, WEDNESDAY -> 3;
      case THURDAY, FRIDAY -> 2;
      default -> 1;
    };
    System.out.println(value);

    // yield
    int value2 = switch (day) {
      case MONDAY:
        yield 2;
      case TUESDAY, THURDAY:
        yield 4;
      case WEDNESDAY:
        yield 5;
      default:
        yield 3;
    };
    System.out.println(value2);

    int value3 = switch (day) {
      case MONDAY -> {
        System.out.println("Monday");
        yield 1;
      }
      case TUESDAY, THURDAY -> {
        System.out.println("Tueseday or Thurday");
        yield 2;
      }
      case WEDNESDAY -> {
        System.out.println("Wednesday");
        yield 3;
      }
      default -> {
        System.out.println("default");
        yield 3;
      }
    };
    System.out.println(value3);


  }
}
