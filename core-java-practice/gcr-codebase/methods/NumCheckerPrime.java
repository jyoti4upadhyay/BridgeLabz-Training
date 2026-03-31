import java.util.Scanner;

//Prime Number
public class NumCheckerPrime{
    public boolean PrimeNumber(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //Neon number
    public boolean neonNumber(int num){
        int sum=0;
        int square=(int) Math.pow(num,2);
        while(square>0){
            int rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }
    }
    //Spy number 
    public boolean spyNumber(int num){
        int prod=1;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            prod=prod*rem;
            num=num/10;
        }
        if(prod==sum){
            return true;
        }
        else {
            return false;
        }
    }  
    //Automorphic Number

    public boolean automophicnum(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        int sq=(int)Math.pow(num,2);
        int power=1;
        for(int i=0;i<count;i++){
            power=power*10;
        }
        if(sq%power==num){
            return true;
        }
        else{
            return false;
        }

    }
    //buzz number

    public boolean buzzNumber(int num){
        if(num%10==7 || num%7==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        NumCheckerPrime check=new NumCheckerPrime();
        boolean prime_result=check.PrimeNumber(num);
        boolean neonNumber_result=check.neonNumber(num);
        boolean spy_result=check.spyNumber(num);
        boolean buzzNumber=check.buzzNumber(num);
        boolean automophicnum=check.automophicnum(num);
        if(prime_result){
            System.out.println("Prime number ");
        }
        if(neonNumber_result){
            System.out.println("neonNumber_result");
        }
        if(spy_result){
            System.out.println("spynumber");
        }
        if(buzzNumber){
            System.out.println("buzzNumber");
        }
        if(automophicnum){
            System.out.println("Automorphic Number");
        }
    
    }
}