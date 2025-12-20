import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] salary=new double[10];
        double[] year=new double[10];
        double[] bonus=new double[10];
        double[] newSalary=new double[10];

        int yearIndex=0;
        int newSalaryIndex=0;
        int bonusIndex=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and year of service");
            salary[i]=sc.nextInt();
            year[i]=sc.nextInt();
            if(year[i]>=5){
                bonus[i]=salary[i]*0.05;
                newSalary[i]=salary[i]+bonus[i];
                yearIndex++;
                newSalaryIndex++;
                bonusIndex++;
            }
            else if(year[i]<5){
                bonus[i]=salary[i]*0.02;
                newSalary[i]=salary[i]+bonus[i];
                yearIndex++;
                newSalaryIndex++;
                bonusIndex++;

            }

        }
        System.out.println("Old Salary");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(salary[i]+" ");
            
        }
        System.err.println();
        System.out.println("New salary"); 
        for (int i=0;i<10;i++){
            System.out.print(newSalary[i]+" ");
        }
    
    }
    
}
