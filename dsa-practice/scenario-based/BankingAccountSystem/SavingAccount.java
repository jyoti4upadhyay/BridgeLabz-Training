
public class SavingAccount extends BankAccount {
    
    public SavingAccount(String accNum,double bal){
        super(accNum,bal);
    }

    @Override
    public double calFee(){
        return getBalance() * 0.010;
    }
}