import java.util.Scanner;


//perfectNumber
public class NumCheckerperfect {
    public boolean perfectNumber(int num){
        int sum=0;
        for(int i=0;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            return true;
        }
        else return false;
    }
    //Abundant number
     public boolean AbundantNumber(int num){
        int sum=0;
        for(int i=0;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum>num){
            return true;
        }
        else return false;
    }

    //deficient number
     public boolean deficientNumber(int num){
        int sum=0;
        for(int i=0;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum<num){
            return true;
        }
        else return false;
    }
    //Strong Number
    public boolean strong (int num){
        int fact=1;
        int sum=0;
        while(num>0){
            int rem=num%10;
            for(int i=rem;i>0;i--){
                fact=fact*rem;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==num){
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        NumCheckerperfect check=new NumCheckerperfect();
        boolean perfectnum=check.perfectNumber(num);
        boolean abundantNum=check.AbundantNumber(num);
        boolean deficientNum=check.deficientNumber(num);
        boolean strongNum=check.strong(num);
         if(perfectnum){
            System.out.println("Perfect Num");
        }
        if(abundantNum){
            System.out.println("AbundantNum");
        }
        if(deficientNum){
            System.out.println("Deficient number");
        }
        if(strongNum){
            System.out.println("Strong Num");
        }
    }
    
}
