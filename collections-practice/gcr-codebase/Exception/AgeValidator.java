import java.util.*;

public class AgeValidator {
    static void validateAge(int age ) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access Granted");
    }
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        try {
            validateAge(age);
            
        } catch ( InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    
}
class InvalidAgeException extends Exception {
    public InvalidAgeException( String mssg){
        super (mssg);
    }
}
