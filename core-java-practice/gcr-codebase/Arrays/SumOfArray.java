import java.util.Scanner;
public class SumOfArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        double[] arr=new double[size];
        int i=0;
        while(true){
            double num=sc.nextDouble();
            if(num<=0){
                break;
            }
            else if(i==size){
                break;
            }
            arr[i]=num;

            i++;
        }
        double sum=0;
        for(int j=0;j<size;j++){
            sum=sum+arr[j];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
