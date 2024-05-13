import java.util.Arrays;

public enum OrderStatus {
  COMFIRMED(1, "Ordered."),
  PAID(2, "Paid."),
  READY_TO_SHIP(3, "Ready to ship."),
  DELIVERED(4, "Delivered.");

  private final int code;
  private final String desc;

  private OrderStatus(int code, String desc){
    this.code = code;
    this.desc = desc;
  }

  public int getCode(){
    return this.code;
  }

  public String getDesc(){
    return this.desc;
  }

  public static OrderStatus get(int code){
    // stream to find enum (code == 2), return

    // for (OrderStatus os : OrderStatus.values()){}

    // Array -> List -> Stream
    // Arrays.asList(values())

    // Array -> Stream
    return Arrays.stream(values())
          .filter(e -> e.getCode() == 2)
          .findFirst()
          .orElseThrow(() -> new IllegalArgumentException()); 
  }

}
