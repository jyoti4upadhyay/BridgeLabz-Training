
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate input=LocalDate.now();

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format1 (dd/MM/yyyy):"+input.format(format1));
        System.out.println("Format2 (yyyy-MM-dd):"+input.format(format2));
        System.out.println("Format3 (EEE,MMM dd,yyyy):"+input.format(format3));

        
    }

    
}
