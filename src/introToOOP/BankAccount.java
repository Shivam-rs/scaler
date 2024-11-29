package introToOOP;

public class BankAccount {

  double balance;
  String ownerName;

  public void deposit(double amount) {
    if(amount <= 0){
      System.out.println("You can't deposit negative amount");
      return;
    }
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    if (balance < amount || balance < 0) {
      System.out.println("Insufficient balance");
      return;
    }

    balance = balance - amount;
  }
}
