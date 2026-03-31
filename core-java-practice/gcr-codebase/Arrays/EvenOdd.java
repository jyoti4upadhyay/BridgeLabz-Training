import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int userInput=sc.nextInt();
        if(userInput<1){
            System.err.println("Enter natural number");
        }
        int size=(userInput/2)+1;
        int[] even=new int[size];
        int[] odd=new int[size];
        int evenIndex=0;
        int oddIndex=0;
        for(int i=1;i<=userInput;i++){
            if(i%2==0){
                even[evenIndex]=i;
                evenIndex++;
            }
            else{
                odd[oddIndex]=i;
                oddIndex++;
            }
        }
        System.out.println("Even Array");
        for(int i=0;i<even.length;i++){
            System.err.println(even[i]);
        }
        System.err.println("Odd Array");
        for(int i=0;i<odd.length;i++){
            System.err.println(odd[i]);
        }
        
    }
    
}
