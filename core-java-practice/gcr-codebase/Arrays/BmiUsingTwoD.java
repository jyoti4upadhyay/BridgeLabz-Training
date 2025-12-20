import java.util.Scanner;
public class BmiUsingTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of persons");
        int num=sc.nextInt();
        double[][] bmi=new double[num][2];
        for(int i=0;i<num;i++){
            System.err.println("Enter height in meters");
            bmi[i][0]=sc.nextDouble();
            System.err.println("Enter weight in kgs");
            bmi[i][1]=sc.nextDouble();
        }
        String[] weightStatus=new String[num];
        for(int i=0;i<num;i++){
            double bmivalue=bmi[i][1]/(bmi[i][0]*bmi[i][0]);
            if(bmivalue<18.5){
                weightStatus[i]=" underweight ";
            }
            else if(bmivalue>=18.5 && bmivalue<24.9){
                weightStatus[i]=" normal weight ";
            }
            else if(bmivalue>=25 && bmivalue<29.9){
                weightStatus[i]="overweight";
            }
            else{
                weightStatus[i]="obese";
            }

        }
        for(int i=0;i<num;i++){
            System.out.println("Person height is "+bmi[i][0]+"Weight is "+bmi[i][1]+" and weight status is "+weightStatus[i]);
        }


    }
}