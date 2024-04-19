package deliveryOrder;

import java.util.Arrays;

public class Merchant {
  
  private String merchantName;

  private String deliveryTime;

  private Material[]materials;

  public Merchant(String merchantName, String deliveryTime){
    this.merchantName = merchantName;
    this.deliveryTime = deliveryTime;
    this.materials = new Material[0];
  }

  public void addMaterial(Material material){
    Material[] copyArr = this.materials;
    this.materials = new Material[copyArr.length + 1];
    for (int i=0; i<copyArr.length; i++){
      materials[i] = copyArr[i];
    }
    materials[copyArr.length] = material;
  }

  public String toString(){
    return " Merchant Name: "//
    + this.merchantName//
    + " delivery Time: "//
    + this.deliveryTime//
    + Arrays.toString(materials);
  }

}
