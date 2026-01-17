public class PeakElement {
    public static void main(String[] args) {
        int[] arr={1,3,8,13,4,2};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] input){
        int left=0;
        int right=input.length-1;
      
        while(left<=right){
            int mid=left+(right-left)/2;
            if(input[mid]<input[mid+1]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return input[left];


    }
}