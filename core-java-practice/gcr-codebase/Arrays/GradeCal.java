import java.util.Scanner;
public class GradeCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int num=sc.nextInt();
        int[] maths=new int[num];
        int[] physics=new int[num];
        int[] chemistry=new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter marks for maths");
            maths[i]=sc.nextInt();
            if(maths[i]<0 ){
                System.out.println("Invalid marks,please enter marks between 0 to 100");
                maths[i]=sc.nextInt();
            }
            System.out.println("Enter marks for physics");
            physics[i]=sc.nextInt();
            if(physics[i]<0 ){
                System.out.println("Invalid marks,please enter marks between 0 to 100");
                physics[i]=sc.nextInt();
            }

            System.out.println("Enter marks for chemistry");
            chemistry[i]=sc.nextInt();
            if(chemistry[i]<0 ){
                System.out.println("Invalid marks,please enter marks between 0 to 100");
                chemistry[i]=sc.nextInt();
            }
        }
        int[] percentage=new int[num];
        for(int i=0;i<num;i++){
            percentage[i]=(maths[i]+physics[i]+chemistry[i])/3;
        }
        String[] grade=new String[num];
        for(int i=0;i<num;i++){
            if(percentage[i]>=80){
                grade[i]="Level 4 ,above agency-normalized Standards";}
            else if(percentage[i]>=70 && percentage[i]<=79){
                grade[i]="Level3,at agency-normalized standards";
            }
            else if(percentage[i]>=60 && percentage[i]<=69){
                grade[i]="Level 2,Below,but approaching agency-normalized standards";
            }
            else if(percentage[i]>=50 &&  percentage[i]<=59){
                grade[i]="Level 1,Well Below agency-normalized Standards";
            }
            else if(percentage[i]>=40 &&  percentage[i]<=49){
                grade[i]="Level 1,too below agency-normalized standards";
            }
            else{
                grade[i]="Remedial standards";
            }
            
        }
        for (int i = 0; i < num; i++) {
            System.out.println(
            "Maths Marks: " + maths[i] +
            ", Physics Marks: " + physics[i] +
            ", Chemistry Marks: " + chemistry[i] +
            ", Percentage: " + percentage[i] +
            ", Grade: " + grade[i]);
        }
    }
}
