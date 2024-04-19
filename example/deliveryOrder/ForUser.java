package deliveryOrder;

public class ForUser {
  public static void main(String[] args) {

    DeliveryDate d1 = new DeliveryDate("2024.4.10");
    DeliveryDate d2 = new DeliveryDate("2024.4.11");
    Merchant m1 = new Merchant("Aeon Diamond Hills Store", "Before 17:00");
    Merchant m2 = new Merchant("Aeon Kowloon Bay Store", "14:00 ~ 15:30");
    Material i1 = new Material("Thermal Rolls");
    Material i2 = new Material("A4 Paper");
    Material i3 = new Material("A3 Paper");
    DeliveryQty q1 = new DeliveryQty(1000);
    DeliveryQty q2 = new DeliveryQty(2000);
    DeliveryQty q3 = new DeliveryQty(5000);

    d1.addMerchant(m1);
    m1.addMaterial(i2);
    m1.addMaterial(i3);
    i2.addQty(q1);
    i3.addQty(q2);

    d2.addMerchant(m2);
    m2.addMaterial(i1);
    m2.addMaterial(i3);
    i1.addQty(q3);
    i3.addQty(q1);

    System.out.println(d1);
    System.out.println(d2);

  }
}
