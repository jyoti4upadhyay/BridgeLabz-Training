import java.util.Scanner;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
      int len=arr.length;
      
      boolean swapped;

        for(int i=0;i<len-1;i++){
            swapped=false;
            for(int j=0;j<(len-1)-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped == false) break;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] marks=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }

        bubbleSort(marks);
        for(int j=0;j<size;j++){
            System.out.print(marks[j]+" ");
        }
    }
    
}
