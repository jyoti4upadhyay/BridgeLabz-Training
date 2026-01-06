public class BankAccount{
    private String bankAccount;
    private double balance;
    BankAccount(String bankaccount,double balance){
        this.balance=balance;
        this.bankAccount=bankAccount;
    }
    //deposit
    void deposit(double amt){
        if(amt>0){
            balance=balance+amt;
            System.out.print("current balance"+balance);
        }
        else{
            System.out.println("Invalid deposit");        
        }
    }
    //Withdraw

    void withdraw(double amt){
        if(amt<=0){
            System.out.println("Invalid withdrawal amount.");
        }
        else if(amt>balance){
            System.out.println("Insufficient amt");
        }
        else{
            balance=balance-amt;
            System.out.println("current balance: "+ balance);

        }
    }
    void checkBalance(){
        System.out.println(" Current Balance"+balance);
    }
    public static void main(String[] args){
        BankAccount ac=new BankAccount()
    }

}