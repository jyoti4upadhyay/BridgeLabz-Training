import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Enter positive number");
        }
        String[] arr=new String[num+1];
        for(int i=1;i<arr.length;i++){

            if(i%3==0 && i%5==0){
                arr[i]="FizzBuzz";
            }
            else if(i%5==0){
                arr[i]="Buzz";

            }
            else if(i%3==0){
                arr[i]="Fizz";
            }
           
            else{
                arr[i]=String.valueOf(i);
            }
        }

        for (int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
