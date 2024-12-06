package introToOOP;

import java.sql.Struct;
import java.util.ArrayList;

public class BankAccount {

  private double balance;
  private String ownerName;
  private ArrayList<String> log;

  BankAccount(String ownerName, double balance) {
    this.ownerName = ownerName;
    this.balance = balance;
    log = new ArrayList<>();
  }



  public double getBalance() {
    return balance;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public void deposit(double amount) {
    if(amount <= 0){
      System.out.println("You can't deposit negative amount");
      return;
    }
    balance = balance + amount;
    log.add("Desposited $" + amount);
  }

  public void withdraw(double amount) {
    if (balance < amount || amount > 0) {
      System.out.println("Insufficient balance");
      return;
    }

    balance = balance - amount;
    log.add("WWithdrew $" + amount);
  }

  public void printTracsactionHistiory(){
    for(String s : log){
      System.out.println(s);
    }
  }
}
