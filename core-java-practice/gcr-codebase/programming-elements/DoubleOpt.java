import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double val1=sc.nextDouble();
        double val2=sc.nextDouble();
        double val3=sc.nextDouble();
        double opt1=val1+val2*val3;
        double opt2=val1*val2+val3;
        double opt3=val3+val1/val2;
        double opt4=val1%val2+val3;
        System.out.println("The results of Double Operations are "+opt1+","+opt2+","+opt3+","+opt4);


    }

}
