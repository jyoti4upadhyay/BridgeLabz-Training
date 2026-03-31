
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={5,8,9,12,34,56,78,89,98};
        System.out.println(smallestElement(arr));
    }
    public static int smallestElement(int[] input){
        int left=0;
        int right=input.length-1;
        while(left<=right){
            int mid=(right-left)+left/2;
            if(input[mid]>input[left]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    
}
