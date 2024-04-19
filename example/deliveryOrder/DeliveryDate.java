package deliveryOrder;

import java.util.Arrays;

public class DeliveryDate {
  
  private String Date;

  private Merchant[]merchants;

  public DeliveryDate(String Date){
    this.Date = Date;
    this.merchants = new Merchant[0];
  }

  public void addMerchant(Merchant merchant){
    Merchant[] copyArr = this.merchants;
    this.merchants = new Merchant[copyArr.length + 1];
    for (int i=0; i<copyArr.length; i++){
      merchants[i] = copyArr[i];
    }
    merchants[copyArr.length] = merchant;
  }

  public String toString(){
    return "Delivery Date: "//
    + this.Date//
    + " to "//
    + Arrays.toString(merchants);
  }

}
