import java.util.Scanner;
public class Rotatektimes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of k");
        int k=sc.nextInt();
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int revarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            revarr[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<size-k;i++){
            revarr[i]=arr[size-1-i];
        }
        for(int i=size-k;i<size;i++){
            revarr[i]=arr[size-k-1-i];
        }
        for(int i=0;i<revarr.length;i++){
            System.out.println(arr[i]+" ");
        }
}
    
}
