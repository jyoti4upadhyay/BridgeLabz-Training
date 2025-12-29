import java .time.LocalDate;
import java.util.Scanner;
public class DateCal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your date in YYYY-MM-DD formate");
        String input=sc.nextLine();
        LocalDate date=LocalDate.parse(input);
        LocalDate result=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Final Date after addition and subtraction"+result);
        
    }
    
}
