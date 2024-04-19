public class Account {

  private Transaction[] transactions;

  // public Account(String name){
  //   this.AccountName = name;
  // }

  public Account() {
    this.transactions = new Transaction[0];
  }

  public static boolean isDebitEnough(Account account, double amount){
    return account.balance() >= amount;
  }

  public void add(Transaction transaction){
    Transaction[] copyArr = this.transactions;
    this.transactions = new Transaction[copyArr.length + 1];
    int idx = 0;
    for (Transaction t : copyArr){
      this.transactions[idx++] = t;
    }
    this.transactions[idx] = transaction;
  }

  public double balance(){
    double sum = 0;
    for (int i=0; i<transactions.length; i++){
      if (transactions[i].getSign() == Sign.CREDIT) {
        sum += transactions[i].getAmount();
      }else{
        sum -= transactions[i].getAmount();
      }
    }
    return sum;
  }

  public void credit(Currency currency, double amount){
    Transaction transaction = new Transaction(Sign.CREDIT, currency, amount);
    add(transaction);
  }

  // boolean
  public void debit(Currency currency, double amount){
    if (isDebitEnough(this, amount) == true) {
      Transaction transaction = new Transaction(Sign.DEBIT, currency, amount);
      add(transaction);
    }else{
      System.out.println("The balance is not enough for debit.");
    }
  }

  public static void main(String[] args) {
    Account account = new Account();
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 1000));
    account.add(new Transaction(Sign.DEBIT, Currency.HKD, 500));
    System.out.println(account.balance());// 500.0

    account.credit(Currency.HKD, 2200);
    account.debit(Currency.HKD, 1000);
    System.out.println(account.balance());// 500 + 2200 - 1000 = 1700.0
  }
}
