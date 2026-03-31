import java.util.Scanner;
public class RoundCal {
    public int calRound(int side1,int side2,int side3){
        int perimeter=side1+side2+side3;
        int round=perimeter/5;
        return round;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle in kilo meters");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        RoundCal rc=new RoundCal();
        int rounds =rc.calRound(side1,side2,side3);
        if(rounds>0){
            System.out.println("Total rounds of triangle is "+ rounds);
        }
        else{
            System.out.println(" Even Single round is not completed");
        }




        
    } 

    
}
