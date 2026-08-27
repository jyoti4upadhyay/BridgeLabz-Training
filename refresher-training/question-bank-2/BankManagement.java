import java.util.*;

abstract class Bank{
    public abstract double averageLoans(List<Double>loans);
    public abstract double minLoans(List<Double>loans);
    public abstract double maxLoans(List<Double>loans);

}
class PersonalBank extends Bank {
    @Override
    public double averageLoans(List<Double>loans){
        double  total=0.0;
        for(int i=0;i<loans.size();i++){
            total=total+loans.get(i);
        }
        double res=total/loans.size();
        return res;
    }
    @Override
    public double minLoans(List<Double>loans){
        double min=Double.MAX_VALUE;
        for(int i=0;i<loans.size();i++){
            if(min>loans.get(i)){
                min=loans.get(i);
            }
        }
        return min;
    }
    @Override
    public double maxLoans(List<Double>loans){
        double max=Double.MIN_VALUE;
        for(int i=0;i<loans.size();i++){
            if(max>loans.get(i)){
                max=loans.get(i);
            }
        }
        return max;
    }
}
class BusinessBank extends Bank {
    @Override
    public double averageLoans(List<Double>loans){
        double  total=0.0;
        for(int i=0;i<loans.size();i++){
            total=total+loans.get(i);
        }
        double res=total/loans.size();
        return res;
    }
    @Override
    public double minLoans(List<Double>loans){
        double min=Double.MAX_VALUE;
        for(int i=0;i<loans.size();i++){
            if(min>loans.get(i)){
                min=loans.get(i);
            }
        }
        return min;
    }
    @Override
    public double maxLoans(List<Double>loans){
        double max=Double.MIN_VALUE;
        for(int i=0;i<loans.size();i++){
            if(max<loans.get(i)){
                max=loans.get(i);
            }
        }
        return max;
    }
}


public class BankManagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Double>ls=new ArrayList<>();
        for(int i=0;i<num;i++){
            ls.add(sc.nextDouble());
        }
        System.out.println("Enter bank");
        String str=sc.next();
        if(str.equalsIgnoreCase("PersonalBank")){
        PersonalBank pbank=new PersonalBank();
        System.out.println(pbank.averageLoans(ls));
        System.out.println(pbank.minLoans(ls));
        System.out.println(pbank.maxLoans(ls));

        }
        else{
            BusinessBank bbank=new BusinessBank();
            System.out.println(bbank.averageLoans(ls));
            System.out.println(bbank.minLoans(ls));
            System.out.println(bbank.maxLoans(ls));
        }
    }


    
}
