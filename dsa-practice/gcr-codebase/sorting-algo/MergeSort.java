public class MergeSort {
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=(right-left)+left/2;
            mergeSort(arr, left, mid);
            mergeSort(arr,mid+1, right);
            merge(arr, left,mid,right);

        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int temp[]=new int[right-left+1];

        int i=left; // left iterator
        int j=mid+1; // right iterator
        int k=0; // temp array iterator

        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k]=arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }  
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=right){
            temp[k++]=arr[j++];
        }

        //copy temp to original array 

        for(k=0,i=left;k<temp.length;k++,i++ ){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr={9,5,7,9,0,2,5,3};
        int len=arr.length;
        mergeSort(arr,0,len-1);
          for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

        
    }

    
}
