package trade;

import java.util.ArrayList;

public class OrderBook {
  // assumption $1 - $2, $0.05
  // Buy, your price < market price
  // Buy, your price >= market price
  // Sell, your price > market price
  // Sell, your price <= market price

  // Buyer
  // $10 2q (1q) -> trade (1q at $10)
  // $2 1000q

  // Seller
  // $11 3q
  // $13 100q

  // Market Price -> the price of the last trade in the market

  private ArrayList<Order> Buyer;
  private ArrayList<Order> Seller;
  public double MarketPrice;
  
  public OrderBook(){
    Buyer = new ArrayList<>();
    Seller = new ArrayList<>();
    MarketPrice = 1.50;
  }

  public void addBuyerOrder(double price, int quantities){
    this.Buyer.add(new Order(price, quantities));
  }

  public void addSellerOrder(double price, int quantities){
    this.Seller.add(new Order(price, quantities));
  }

  public void trade(){
    for (Order b : Buyer){
      for (Order s : Seller){
        if (b.getPrice() >= MarketPrice && s.getPrice() <= MarketPrice && 
            b.getQuantities() <= s.getQuantities()) {
          Buyer.remove(b);
          Seller.remove(s);
          MarketPrice += 0.05;
          System.out.println("Trade success, the Markert Price has been updated as " + this.MarketPrice);
        } else if (b.getPrice() >= MarketPrice && s.getPrice() <= MarketPrice && 
        b.getQuantities() > s.getQuantities()) {
          System.out.println("The Seller quantity is not enough for trade, need negotiating.");

        } else if (b.getPrice() < MarketPrice && s.getPrice() < MarketPrice) {
          MarketPrice -= 0.05;
          System.out.println("The Markert Price has been updated as " + this.MarketPrice);
        } else if (b.getPrice() > MarketPrice && s.getPrice() > MarketPrice) {
          MarketPrice += 0.05;
          System.out.println("The Markert Price has been updated as " + this.MarketPrice);
        }
      }
    }
  }

  public static boolean isTradeSuccess(Order b, Order s){
    if (b.getPrice() > MarketPrice) {
      
    }
  }

  public static void main(String[] args) {
    OrderBook orderBook = new OrderBook();
    orderBook.addBuyerOrder(1.5, 10);
    orderBook.addBuyerOrder(1.3, 20);
    orderBook.addSellerOrder(1.4, 5);
    orderBook.addSellerOrder(1.6, 25);
    orderBook.trade();

  }
}
