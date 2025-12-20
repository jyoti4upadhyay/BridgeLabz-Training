import java.util.Scanner;

public class PowerOfNumWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pow=sc.nextInt();
        int number=sc.nextInt();

        if(pow<=0){
            System.out.println("Enter Positive number");
        }
        else{
            int answer=1;
            int i=1;
            while(i<=pow){
                answer=answer*number;
                i++;
            }
            System.out.println(answer);
        }
    }
}
