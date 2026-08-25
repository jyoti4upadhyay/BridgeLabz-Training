import java.util.*;

class RobotHazardAuditor{
    public double calculateHazardRisk(double armPrecision,int workerDensity,String machineryState)throws RobotHazardException{
        if(armPrecision<=0.0 && armPrecision>=1.0){
            throw new RobotHazardException("Error: Arm Precision must be 0.0-1.0 ");
        }
        if(workerDensity<1 && workerDensity>20){
            throw new RobotHazardException("Error: Worker density must be 1-20");
        }
        if(!machineryState.equals("Worn") && !machineryState.equals("Faulty") && !machineryState.equals("Critical")){
            throw new RobotHazardException("Error:Unsupported machinery state");
        }
        double mrf=0;
        if(machineryState.equals("Worn")){
            mrf=1.3;
        }
        else if(machineryState.equals("Faulty")){
            mrf=2.0;
        }
        else{
            mrf=3.0;
        }
        double hazardRisk=((1.0-armPrecision)*15.0)+(workerDensity*mrf);
        return hazardRisk;
    }

}
class RobotHazardException extends Exception{
    RobotHazardException(String message){
        super(message);
    }
}

class FactoryRobot{
    public static void main(String [] args){
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Arm Precision(0.0-1.0)");
        double arm=sc.nextDouble();
        System.out.println("Enter Worker Density");
        int density=sc.nextInt();
        System.out.println("Enter Machinery State(Worn/Faulty/Critical)");
        String state=sc.next();

        RobotHazardAuditor robot=new RobotHazardAuditor();
        System.out.println(robot.calculateHazardRisk(arm,density,state));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}