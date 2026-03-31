import java.util.*;
public class TargetSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix_arr={
            {1,2,60},
            {4,6,85},
            {56,89,9}
        };
        int target=sc.nextInt();
        System.out.println(findTarget(matrix_arr, target)); 
    }
    public static boolean findTarget(int[][] arr,int target){
        int row=arr.length;
        int cols=arr[0].length;
        int start=0;
        int end=cols*row-1;

        while(start<=end){
            int mid=(start+end)/2;
            int midval=arr[mid/cols][mid%cols];
            if(midval==target){
                return true;
            }
            else if(midval>target){
                end=mid;
            }
            else{
                start=mid+1;
            }

            
        }
        return false;

    }
    
}
