import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=num;
        int sum=0;
        while(flag>0){
            sum+=flag%10;
            flag=flag/10;
        }
        if(num%sum==0){
            System.err.println("Harshad Number");

        }
        else{
            System.err.println("Not a Harshad Number");
        }
    }
    
}
