import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Marks");
        int maths=sc.nextInt();
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();

        int percent=(maths+physics+chemistry)/3;

        if(percent>=80){
            System.out.println("Level 4 ,above agency-normalized Standards");
        }
        else if(percent>=70 && percent<=79){
            System.out.println("Level3,at agency-normalized standards");
        }
        else if(percent>=60 && percent<=69){
            System.out.println("Level 2,Below,but approaching agency-normalized standards");
        }
        else if(percent>=50 &&  percent<=59){
            System.out.println("Level 1,Well Below agency-normalized Standards");
        }
        else if(percent>=40 &&  percent<=49){
            System.out.println("Level 1,too below agency-normalized standards");
        }
        else{
            System.out.println("Remedial standards");
        }
    }
    
}
