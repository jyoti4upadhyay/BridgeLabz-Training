import java.util.*;
public class BmiTwoD {

	public static String[][] findBMI(double[][]persons){
		String[][]BMIStatus=new String[10][2];
		for(int i=0;i<10;i++) {
			double heightInM=persons[i][1]/100;
			double bmi=persons[i][0]/(heightInM*heightInM);
			BMIStatus[i][0]=String.valueOf(bmi);
			if(bmi<=18.4) BMIStatus[i][1]="Underweight";
			else if(bmi>=18.5 && bmi<=24.9) BMIStatus[i][1]="Normal";
			else if(bmi>=25.0 && bmi<=39.9) BMIStatus[i][1]="Overweight";
			else BMIStatus[i][1]="Obese";
		}
		return BMIStatus;
	}

	public static String[][] makeScore(double[][]persons,String[][]BMIStats){
		String[][]score=new String[10][4];
		for(int i=0;i<10;i++) {
			score[i][0]=String.valueOf(persons[i][0]);  // weight
			score[i][1]=String.valueOf(persons[i][1]);  // height
			score[i][2]=BMIStats[i][0];  // bmi
			score[i][3]=BMIStats[i][1];  // bmi status
		}
		return score;
	}
	public static void displayScore(String[][]scorecard) {
		System.out.println("\n============== BMI SCORE ==============");
		System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
		System.out.println("==============================================");
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"\t"+scorecard[i][0]+"\t\t"+scorecard[i][1]+"\t\t"+scorecard[i][2]+"\t"+scorecard[i][3]);
		}
		System.out.println("==============================================");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double[][]persons=new double[10][2];
		
		
		for(int i=0;i<10;i++) {
			System.out.print("Enter weight in kg and height in cm of "+i+"th"+" person is: ");
			persons[i][0]=sc.nextDouble();
			persons[i][1]=sc.nextDouble();
		}
		
		String[][]BMIStatus=findBMI(persons);
		
	
		String[][]score=makeScore(persons,BMIStatus);
		
	
		displayScore(score);
		
		sc.close();
	}
}