import java.util.Scanner;
public class BmiTracker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Height");
        float height=sc.nextFloat();
        System.out.println("Enter your Weight");
        float weight=sc.nextFloat();

        float bmi=weight/(height*height);

        if(bmi<=18.4){
            System.out.println("You are Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("You are Normal");
        }
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("You are Overweight");
        }
        else if(bmi>=40.0){
            System.out.println("You are Obese");
        }
        
    }
}