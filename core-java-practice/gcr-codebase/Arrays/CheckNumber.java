import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                System.out.println("Positive number");
                if(num[i]%2==0){
                    System.out.println("Even");

                }
                else{
                    System.out.println("Odd");
                }

            }
            else if(num[i]<0){
                System.out.println("Negative number");
            }
            else {
                System.out.println("Zero");
            }
        }
        if(num[0]>num[size-1]){
            System.out.println("First element is greater");
        }
        else if(num[0]<num[size-1]){
            System.out.println("First element is smallest");
        }
        else {
            System.out.println("Equal");
        }
    
        
    }

    
}
