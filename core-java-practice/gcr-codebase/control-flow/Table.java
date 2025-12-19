import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mul=1;
        for(int i=6;i<=9;i++){
            mul=num*i;
            System.out.println(num+"*"+i+"="+mul);
        }
    }
    
}
