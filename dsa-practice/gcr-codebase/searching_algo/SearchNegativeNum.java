
public class SearchNegativeNum {
    public static void linearSearch(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
                break;
            }
        }
        System.out.println("No negative number");
    }
    public static void main(String[] args){
        int[] arr={4,9,8,-2,8,6,-9,3,-7};
        linearSearch(arr);
    }
    
}
