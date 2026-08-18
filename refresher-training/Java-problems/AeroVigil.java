import java.util.*;
class AeroVigil {
    public boolean validateFlightNumber(String flightNumber)throws InvalidFlightException{
        if(flightNumber==null|| !flightNumber.matches("FL-\\d{4}")){
            throw new InvalidFlightException("The flight number "+flightNumber +" is invalid");
        }
        else{
            int number=0;
            for(int i=3;i<flightNumber.length();i++){
                number=number*10+flightNumber.charAt(i)-'0';
            }
            if(number>=1000 && number<=9999){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public boolean validateFlightName(String flightName)throws InvalidFlightException{
        if("SpiceJet".equalsIgnoreCase(flightName)||
        "Vistara".equalsIgnoreCase(flightName)||
        "IndiGo".equalsIgnoreCase(flightName)||
        "Air Arabia".equalsIgnoreCase(flightName)){
            return true;
        }
        else{
            throw  new InvalidFlightException("The flight name "+flightName+" is invalid");
        }

    }
    public boolean validatePassengerCount(int passengerCount,String flightName)throws InvalidFlightException{
        if(flightName.equalsIgnoreCase("SpiceJet")){
            if(passengerCount>0 && passengerCount<=396){
                return true;
            }
        }
        else if(flightName.equalsIgnoreCase("Vistara")){
            if(passengerCount>0 && passengerCount<=615){
                return true;
            }
        }
        else if(flightName.equalsIgnoreCase("IndiGo")){
            if(passengerCount>0 && passengerCount<=230){
                return true;
            }
        }
        else if(flightName.equalsIgnoreCase("Air Arabia")){
            if(passengerCount>0 && passengerCount<=130){
                return true;
            }
        }
        throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);

    }
    public double calculateFuelToFillTank(String flightName,double currentFuelLevel)throws InvalidFlightException{
        double maxFuel;
        if(flightName.equalsIgnoreCase("SpiceJet")){
            maxFuel=200000;
        }
        else if(flightName.equalsIgnoreCase("Vistara")){
            maxFuel=300000;
        }
        else if(flightName.equalsIgnoreCase("IndiGo")){
            maxFuel=250000;
        }
        else if(flightName.equalsIgnoreCase("Air Arabia")){
            maxFuel=150000;
        }
        else {
            throw new InvalidFlightException("Invalid fuel level for "+flightName);
        }
        if(currentFuelLevel<0 || currentFuelLevel>maxFuel){
            throw new InvalidFlightException("Invalid fuel level for"+flightName);
        }
        return maxFuel-currentFuelLevel;

    }   
}
class InvalidFlightException extends Exception{
    public InvalidFlightException(String mssg){
        super(mssg);
    }
}

class UserInterFace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        String input=sc.nextLine();
        String[] arr=input.split(":");
        String flightNumber=arr[0];
        String flightName=arr[1];
        int passengerCount=Integer.parseInt(arr[2]);
        double currentFuel=Double.parseDouble(arr[3]);
        AeroVigil aero=new AeroVigil();
        boolean res1=aero.validateFlightNumber(flightNumber);
        boolean res2=aero.validateFlightName(flightName);
        boolean res3=aero.validatePassengerCount(passengerCount, flightName);
        if(res1==true && res2==true && res3==true){
            double res=aero.calculateFuelToFillTank(flightName, currentFuel);
            System.out.println(res);
        }

        }
        catch(InvalidFlightException e){
            System.out.println(e.getMessage());
        }



    }
}
