import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class LibraryReminder {
    public static void main(String[] args) {
        int books=0;
        while(books<5){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your date of returning book");
            String return_date=sc.next();
            LocalDate returnDate=LocalDate.parse(return_date);
            String due_date=sc.next();
            LocalDate dueDate=LocalDate.parse(due_date);
            long countDays=ChronoUnit.DAYS.between(dueDate,returnDate);
            long fine =countDays*5;
            System.out.println("Total Fine is "+fine);  
        }
        
        
    }
    
}
