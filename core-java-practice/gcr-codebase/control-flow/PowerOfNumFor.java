import java.util.Scanner;

public class PowerOfNumFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pow=sc.nextInt();
        int number=sc.nextInt();

        if(pow<=0){
            System.out.println("Enter Positive number");
        }
        else{
            int answer=1;

            for(int i=1;i<=pow;i++){
                answer=answer*number;
            }
            System.out.println(answer);
        }
    }
}
