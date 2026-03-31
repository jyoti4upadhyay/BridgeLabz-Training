import java.util.regex.*;
public class Date {
    public static void main(String[] args){
        String dateInput="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
    
        Pattern pattern=Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})\\b");
        Matcher matcher=pattern.matcher(dateInput);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    
}
