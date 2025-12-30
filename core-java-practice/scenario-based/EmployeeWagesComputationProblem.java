import java.util.Random;
import java.util.Scanner;
public class EmployeeWagesComputationProblem{
    //UC1--Check 
    public void attendanceCheck(){
        Random rand=new Random();
        int attendance=rand.nextInt(2);
        switch(attendance){
            case 1: 
                System.out.println("Employee is present");
                break;
            case 0:
                System.out.println("Employee is absent");
                break;
        }

    }
    //UC2
    public int EmployeeDailyWages(){
        System.out.println("Enter full day hour");
        Scanner sc=new Scanner(System.in);
        int hr=sc.nextInt();
        System.out.println("Enter per hour wages");
        int wagePerHr=sc.nextInt();
        int DailyWage=wagePerHr*hr;
        System.out.println("Daily wage is "+DailyWage);
        return DailyWage;
    }
    //UC3
    public void partTimeWage(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your part time hour");
        int partTimeHr=scn.nextInt();
        System.out.println("Enter Wage per Part time Hour");
        int wage=scn.nextInt();
        int totalWage=wage*partTimeHr;
        System.out.println("Total wage of Daily PartTime hr is"+totalWage);

    }
    // UC4
    public void switchCase(){
        int perHrwage=20;
        int fulldayhr=8;
        int parttimehr=4;

        Random rn=new Random();
        int atten=rn.nextInt(3);
        int workinghr=0;

        switch(atten){
            case 0: 
                workinghr=0;
                System.out.println("Absent");
                break;
            case 1:
                workinghr=parttimehr;
                System.out.println("Part time work");
                break;
            case 2:
                workinghr=fulldayhr;
                System.out.println("Full Day work");
                break;
        }
        int wage=workinghr*perHrwage;
        System.out.println("DailyWage"+wage);

    }
    //UC5
    public void monthlyWage(int Dailywage){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total working days in months");
        int workingdays=sc.nextInt();
        int monthyWage=Dailywage*workingdays;
        System.out.println("Monthly Wage of Employee is "+monthyWage);
    }

    //Uc6
    public void totalWorkingHr(){
        int totalHour=0;
        Scanner sc=new Scanner(System.in);
        int totalwage=0;
        int totaldays=0;
        while(totalHour<100 && totaldays<20){
            totaldays++;
            System.out.println("Enter your choice 0:Absent,1:8hr,2:4hr");
            int attend=sc.nextInt();//0,1,2
            int workingHr=0;

            switch(attend){
                case 1:
                    workingHr=8;
                    break;
                case 2:
                    workingHr=4;
                    break;
                case 0:
                    workingHr=0;
                    break;
            }
            totalHour=totalHour+workingHr;
            totalwage=totalwage+(workingHr*20);
        }
        System.out.println("Total wage of 100 hr is"+totalwage);

    }
    public static void main(String[] args) {
        EmployeeWagesComputationProblem plbm=new EmployeeWagesComputationProblem();
        plbm.attendanceCheck();
        int wage_daily=plbm.EmployeeDailyWages();
        plbm.partTimeWage();
        plbm.monthlyWage(wage_daily);
        plbm.totalWorkingHr();

        
    }

    
    
}
