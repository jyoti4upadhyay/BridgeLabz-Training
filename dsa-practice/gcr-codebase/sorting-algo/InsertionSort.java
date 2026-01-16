import java.util.*;
public class InsertionSort {
    public static void insertion(int[] arr){
        int len=arr.length;

        for(int i=1;i<len;i++){
            int unsortV=i;
            int sortV=i-1;
            while(arr[sortV]>arr[unsortV] && sortV>=0){
            arr[sortV+1]=arr[sortV];
            sortV--;
            }
            arr[sortV+1]=arr[unsortV];


        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] employee_Id=new int[size];

        for(int i=0;i<size;i++){
            employee_Id[i]=sc.nextInt();
        }
        insertion(employee_Id);

        for(int i=0;i<size;i++){
            System.out.print(employee_Id[i]+" ");
        }
    }
    
}
