package DeliveryOrder;

import java.util.Arrays;

public class Material {
  
  private String materialName;

  private DeliveryQty[]deliveryQties;

  public Material(String materialName){
    this.materialName = materialName;
    this.deliveryQties = new DeliveryQty[0];
  }

  public void addQty(DeliveryQty qty){
    DeliveryQty[] copyArr = this.deliveryQties;
    this.deliveryQties = new DeliveryQty[copyArr.length + 1];
    for (int i=0; i<copyArr.length; i++){
      deliveryQties[i] = copyArr[i];
    }
    deliveryQties[copyArr.length] = qty;
  }

  public String toString(){
    return " Material Name: "//
    + this.materialName//
    + Arrays.toString(deliveryQties);
  }

}
