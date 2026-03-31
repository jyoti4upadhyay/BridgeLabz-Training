
public abstract class BankAccount {
     private final String accNumber;
     private final double balance;

     public BankAccount(String accNumber,double balance){
        this.accNumber= accNumber;
        this.balance= balance;
     }

     protected double getBalance(){
        return balance;
     }

     public abstract double calFee();
     
}
