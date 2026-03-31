import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] revArr=new int[size];
        for (int i =0; i <size; i++) {
            revArr[i]=arr[size-1-i];
            
        }
        for(int i=0;i<size;i++){
            System.out.print(revArr[i]+" ");
        }
    }
    
}
