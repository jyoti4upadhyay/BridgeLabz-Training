public class SelectionSort {
    public static void main(String[] args) {
        int score_arr[]={5,7,0,3,9,6,2,4};
        selectionSort(score_arr);
        for(int i=0;i<score_arr.length;i++){
            System.out.print(score_arr[i]+" ");
        }

    }
    public static void selectionSort(int[] arr){
        int len=arr.length;

        for(int i=0;i<len-1;i++){
            int minind=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<minind){
                    minind=j;
             
                }
            }
            int temp=arr[i];
            arr[i]=arr[minind];
            arr[minind]=temp;
        }
    }
}
