import java.util.Scanner;
public class BmiCal {
    public static void main(String[] args) {
        System.out.println("Enter number of persons");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double height[]=new double[num];
        double weight[]=new double[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter height in meters");
            height[i]=sc.nextDouble();
            System.out.println("Enter weight in kgs");
            weight[i]=sc.nextDouble();
        }
        double[] bmi=new double[num];
        for(int i=0;i<num;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
        }
        String[] category=new String[num];
        for(int i=0;i<num;i++){
            if(bmi[i]<18.5){
                category[i]="Person is underweight with BMI "+bmi[i];
            }
            else if(bmi[i]>=18.5 && bmi[i]<24.9){
                category[i]="Person is normal weight with BMI "+bmi[i];
            }
            else if(bmi[i]>=25 && bmi[i]<29.9){
                category[i]="Person is overweight with BMI "+bmi[i];
            }
            else{
                category[i]="Person is obese with BMI "+bmi[i];
            }
        }
        for(int i=0;i<num;i++){
            System.out.println(category[i]);
        }
    }
    
}
