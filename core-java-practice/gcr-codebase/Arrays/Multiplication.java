import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] res=new int[10];
        for(int i=1;i>=10;i++){
            res[i]=num*i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(num+"*"+i+"="+res[i]);
            
        }


        
    }
    
}
