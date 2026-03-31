
public class BankMain {

    public static void main(String[] args) {

        BankAccount savings1 = new SavingAccount("1999", 1000);
        System.out.printf("%.2f%n", saving1.calFee());

        BankAccount savings2 = new SavingAccount("22222", 500);
        System.out.printf("%.2f%n", saving2.calFee());

        BankAccount checking1 = new CheckingAccount("33333", 1500);
        System.out.printf("%.2f%n", checkingacc1.calFee());

        BankAccount checking2 = new CheckingAccount("44444", 500);
        System.out.printf("%.2f%n", checkingacc2.calFee()); 
    }
}
