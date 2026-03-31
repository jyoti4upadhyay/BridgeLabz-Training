import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

        int date = sc.nextInt(); 
        int year = sc.nextInt(); 
        int month=sc.nextInt();
        int res_month=year - (14 - month) / 12;
        int x=res_month + res_month / 4 - res_month / 100 + res_month / 400;
        int res=month+ 12 * ((14 - month) / 12) - 2;
        int res_date=(date + res + (31 * res_month) / 12) % 7;
        System.out.println(res_date); 
    }
}