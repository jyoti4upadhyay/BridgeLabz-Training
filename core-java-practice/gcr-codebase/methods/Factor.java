import java.util.Scanner;

public class Factor {
    public static int[] factor(int num){
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[] factorarr=new int[count];
        int ind=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                factorarr[ind]=i;
            }
            ind++;
        }
        return factorarr;
    }
    public static int greaterFactor(int[] arr){
        int greater=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>greater){
                greater=arr[i];
            }
        }
        return greater;
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        return sum;
    }
    public static int product(int[] arr){
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod=prod*arr[i];
        }
        return prod;
    }
    public static double productOfCube(int[] arr){
        double prodofcube=1;
        for(int i=0;i<arr.length;i++){
            prodofcube=prodofcube*Math.pow(arr[i],3);

        }   
        return prodofcube;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact[] =factor(num);
        display(fact);

        System.out.println("Greatest Factor = " + greaterFactor(fact));
        System.out.println("Sum of Factors = " + sum(fact));
        System.out.println("Product of Factors = " +product(fact));
        System.out.println("Product of Cube of Factors = " +productOfCube(fact));
    }
}

