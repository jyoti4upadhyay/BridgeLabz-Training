import java.util.Scanner;
public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int count=0;
        int temp=num;
        while(num>0){
            count++;
            num=num/10;
        }
        int[] freq=new int[10];
         while(temp>0){
            int rem=temp%10;
            freq[rem]++;
            temp=temp/10;
        }
        for(int i=0;i<10;i++){
            System.out.println("The frequency of "+i+" is "+freq[i]);
        }










        
    }


    
    
}
