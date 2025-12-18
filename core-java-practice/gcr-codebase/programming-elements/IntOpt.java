import java.util.Scanner;

public class IntOpt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val1=sc.nextInt();
        int val2=sc.nextInt();
        int val3=sc.nextInt();
        int op1=(int)val1+val2*val3;
        int op2=(int)val1*val2+val3;
        int op3=(int)val3+val1/val2;
        int op4= (int)val1%val2+val3;
        System.out.println("The results of Int Operations are "+op1+","+op2+","+op3+","+op4);



        
    }
    
}
