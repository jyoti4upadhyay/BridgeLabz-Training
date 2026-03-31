public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,5,6};
        int target=4;
        System.out.println(firstOccurrence(arr, target));
        System.out.println(lastOccurrence(arr, target));
        
    }
    public static int firstOccurrence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return result;
    }
    public static int lastOccurrence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int res=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                res=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }

    
}
