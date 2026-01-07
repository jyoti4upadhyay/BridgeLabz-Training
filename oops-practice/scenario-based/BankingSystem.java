import java.util.*;
abstract  class Account{
    String holdername;
    String accountNumber;
     Double balance;

    public Account(String holdername, String accountNumber, Double balance) {
        this.holdername = holdername;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amt){
        balance=balance+amt;
    }
    public void Withdraw(double amt)throws InsufficientBalanceException {
        if(balance<amt){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else{
            balance=balance-amt;
        }
    }
    public double  getbalance(){
        return balance;
    }
    abstract double calInterest();   
}

//Saving account

class Savingacc extends Account{
    Savingacc(String accountNumber,String holderName,double balance){
        super(holderName, accountNumber,balance);
    }
    double calInterest(){
        return balance*0.98;
    }
}

//Current Account having Zero interest
class CurrentAcc extends Account{
    CurrentAcc(String accountNumber,String holderName,double balance){
        super(accountNumber,holderName,balance);
    }

    double calInterest(){
        return 0;
    }
}

//BankService Interface
interface Bankservice{
    void createAccount(Account acc);

}

class Transaction{
    String senderAccNum;
    String receiverAccNum;
    double amt;

    Transaction(String senderAccNum,String receiverAccNum,double amt){
        this.senderAccNum=senderAccNum;
        this.receiverAccNum=receiverAccNum;
        this.amt=amt;
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
//Bank Service implement
class BankServiceImpl implements Bankservice{
    private List<Account> accounts =new ArrayList<>();
    private List<Transaction> pastHistory=new ArrayList<>();
    public static void transact(BankServiceImpl bankServiceImpl, Account from ,Account to,double amount) throws InsufficientBalanceException{
        from.Withdraw(amount);
        to.deposit(amount);

        bankServiceImpl.pastHistory.add(new Transaction(from.accountNumber,to.accountNumber,amount));

    }

    @Override
    public void createAccount(Account acc) {
        accounts.add(acc);
    }

}


public class BankingSystem {
    public static void main(String[] args) throws InsufficientBalanceException {
         BankServiceImpl bank = new BankServiceImpl();

        Account a1 = new Savingacc("Jyoti", "SA101", 5000);
        Account a2 = new CurrentAcc("Rahul", "CA201", 3000);

        bank.createAccount(a1);
        bank.createAccount(a2);

        BankServiceImpl.transact(bank, a1, a2, 1000);

        System.out.println("Jyoti Balance: " + a1.getbalance());
        System.out.println("Rahul Balance: " + a2.getbalance());
        
        
    }

    
}
