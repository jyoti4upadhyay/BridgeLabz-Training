
class Account{
    int accountNumber;
    double balance;
    Account(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

}
class SavingAccount extends Account{
    double interestRate;
    SavingAccount(double interestRate,int accountNumber,double balance){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    void display(){
        System.out.println("Saving Account"+(balance-interestRate));
    }

}
class CheckingAccount extends Account{
    double withdrawalLimit;

    public CheckingAccount(double withdrawalLimit, int accountNumber, double balance) {
        super(accountNumber,balance);
        this.withdrawalLimit = withdrawalLimit;
    }
     void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
class FixedDepositAccount extends Account {
    int termInMonths;

    FixedDepositAccount(int accountNumber, double balance, int termInMonths) {
        super(accountNumber,balance);
        this.termInMonths = termInMonths;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit - Term: " + termInMonths + " months");
    }
}

public class BankAccount{
    public static void main(String[] args) {
        SavingAccount sv=new SavingAccount(456,5000,4.5);
        CheckingAccount ca=new CheckingAccount(5987, 250, 10000);
        FixedDepositAccount fd=new FixedDepositAccount(444, 100000, 12);

        sv.display();
        ca.displayAccountType();
        fd.displayAccountType();

    }

}

