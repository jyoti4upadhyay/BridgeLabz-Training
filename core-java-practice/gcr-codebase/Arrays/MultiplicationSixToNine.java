import java.util.Scanner;

public class MultiplicationSixToNine {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] res=new int[4];
        for(int i=6;i>=9;i++){
            res[i]=num*i;
        }
        for (int i =0; i <4; i++) {
            System.out.println(num+"*"+i+"="+res[i]);
            
        }


        
    }
    

      


        
    
    
    
}
