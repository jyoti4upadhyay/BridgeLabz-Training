
public class InterestCal{
    static double calInterest(double amt,double rate, int year) throws IllegalArgumentException{
        if(amt<0 || rate<0 || year<0){
            throw new IllegalArgumentException("Invalid Input");
        }
        return (amt*rate*year)/100;
    }
    public static void main(String[] args){
        try {
            double interest=calInterest(1000,5,8);
            System.out.println(interest);
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }



}