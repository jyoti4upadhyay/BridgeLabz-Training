import java.util.Scanner;

public class Armstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        int temp=num;
        int countdigit=0;
        while(temp!=0){
            countdigit++;
            temp=temp/10;
        }
        temp=num;

        while(temp!=0){
            int rem=temp%10;
            res=(int) (res+Math.pow(rem,countdigit));
            temp=temp/10;
        }

        if(num==res){
            System.err.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
                

    }
    
}
