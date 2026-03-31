import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];

            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The second largest number is "+secondLargest);
        

        
    }
    
}
