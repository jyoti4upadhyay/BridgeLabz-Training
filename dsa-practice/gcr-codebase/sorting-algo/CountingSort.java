
public class CountingSort{
    public static void main(String[] args) {
        int[] ages = {90,67,89,67,7,34,9,2,80};
        countingSort(ages,2,90);
        for(int i=0;i<ages.length;i++){
            System.out.print(ages[i]+ " ");
        }

    }

    public static void countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int num : arr) count[num - min]++;
        int index = 0;
        for (int i = 0; i < count.length; i++)
            while (count[i]-- > 0){
                arr[index++] = i + min;
            }
    }
}
