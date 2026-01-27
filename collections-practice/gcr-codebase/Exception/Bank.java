
class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<0){
            throw new IllegalArgumentException("Invalid balance");
        }else if (amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");

        }else {
            balance=balance-amount;
            System.out.println("Withdrawal Successful");
            }
        }
}
public class Bank{
        public static void main(String[] args ){
            BankAccount acc=new BankAccount(400);
            try {
                acc.withdraw(600);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
    
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String mssg){
        super(mssg);
    }
}
