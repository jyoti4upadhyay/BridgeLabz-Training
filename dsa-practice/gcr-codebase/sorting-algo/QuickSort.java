public class QuickSort {
    public static void quickSort(int[] arr ,int low,int high){
        if(low<high){
            int pivot=partition(arr, low, high);
            quickSort(arr, low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
     public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;


    }

    public static void main(String[] args){
        int[] price_arr={5,8,5,7,2,9};
        int len=price_arr.length;
        quickSort(price_arr,0,len-1);
        for(int i=0;i<len;i++){
            System.out.print(price_arr[i]+" ");
        }

    }
}
