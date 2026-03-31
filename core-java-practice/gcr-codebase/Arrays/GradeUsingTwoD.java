import java.util.Scanner;
public class GradeUsingTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int num=sc.nextInt();
        int[][] marks=new int[num][3];
        for(int i=0;i<num;i++){
            System.out.println("Enter marks for maths");
            marks[i][0]=sc.nextInt();
            if(marks[i][0]<0 ){
                System.out.println("Invalid marks,please enter marks between 0 to 100");
                marks[i][0]=sc.nextInt();
            }
            System.out.println("Enter marks for physics");
            marks[i][1]=sc.nextInt();
            if(marks[i][1]<0 ){
                System.out.println("Invalid marks,please enter marks between 0 to 100");
                marks[i][1]=sc.nextInt();
            }

            System.out.println("Enter marks for chemistry");
            marks[i][2]=sc.nextInt();
            if(marks[i][2]<0 ){
                System.out.println("Invalid marks,please enter marks between 0 to 100");
                marks[i][2]=sc.nextInt();
            }
        }
        int[] percentage=new int[num];
        for(int i=0;i<num;i++){
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
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
            "Maths Marks: " +marks[i][0]+
            ", Physics Marks: " + marks[i][1] +
            ", Chemistry Marks: " + marks[i][2] +
            ", Percentage: " + percentage[i] +
            ", Grade: " + grade[i]);
        }
    }
}
