public class Debt {
  
  private double amount;
  private int dueDay;

  public void setAmount(double amount){
    this.amount=amount;
  }

  public void setDueDay(int dueDay){
    this.dueDay=dueDay;
  }

  public String toString(){
    if (this.amount>=1000 && dueDay>=90) {
      return "The Debt is over due.";
    }else{
      return "The Debt is not over due.";
    }
  }

  public static void main(String[] args) {
    Debt d1 = new Debt();
    d1.setAmount(5218.24);
    d1.setDueDay(103);
    Debt d2 = new Debt();
    d2.setAmount(944.20);
    d2.setDueDay(112);
    System.out.println(d1.toString());
    System.out.println(d2.toString());
  }

}