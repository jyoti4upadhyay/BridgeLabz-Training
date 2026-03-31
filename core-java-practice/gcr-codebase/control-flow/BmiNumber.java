import java.util.Scanner;

public class BmiNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Weight and Height");
        float weight=sc.nextInt();
        float height=sc.nextInt();
        float bmi=weight/(height*height);
        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("Overweight");
        }
        else if(bmi>=40.0){
            System.out.println("Obese");
        }
    }
    
}

