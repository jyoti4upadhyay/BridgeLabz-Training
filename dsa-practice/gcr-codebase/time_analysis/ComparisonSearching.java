import java.util.*;
public class ComparisonSearching {
    public static int linear(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid;
            }
            else{
                start=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] size_arr={1000,10_000,1_000_000};

        for(int i=0;i<size_arr.length;i++){
            int[] data_arr=new int[i];
            for(int j=0;j<data_arr.length;j++){
                data_arr[i]=i*2;
            }
        int target_val=-1;

        //linearSearch Timecomplexity

        long startLinear=System.nanoTime();
        int res_linear=linear(data_arr,target_val);
        long endLinear=System.nanoTime();

        //binarySearch Timecomplexity
        Arrays.sort(data_arr);
        long startBinary=System.nanoTime();
        int res_binary=binarySearch(data_arr,target_val);
        long endBinary=System.nanoTime();

        System.out.println("Dataset Size: "+size_arr);
        System.out.println("Linear Search Time(ms): "+(endLinear)/1_000_000.0);
        System.out.println("Binary Search Time(ms): "+(endBinary-startBinary)/1_000_000.0);

        }
    }
    
}
