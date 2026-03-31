import java.util.*;
public class Calender {
	public static String getMonthName(int month) {
		String[]months={"January","February","March","April","May","June",
						"July","August","September","October","November","December"};
		return months[month-1];
	}
		public static boolean isLeapYear(int year) {
		if(year%400==0) return true;
		if(year%100==0) return false;
		if(year%4==0) return true;
		return false;
	}
	public static int getDayInMonth(int month,int year) {
		int[]dayarr={31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2 && isLeapYear(year)) {
			return 29;
		}
		return dayarr[month-1];
	}
	public static int getFirstDay(int month,int year) {
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(1+x+31*m0/12)%7;
		return d0;
	}
	public static void displayCalendar(int month,int year) {
		System.out.println(getMonthName(month)+" "+year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		int firstDay=getFirstDay(month,year);
		int totalDays=getDayInMonth(month,year);
		
		for(int i=0;i<firstDay;i++) System.out.print("    ");
		
		for(int day=1;day<=totalDays;day++) {
			System.out.printf("%3d ",day);
			if((day+firstDay)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter month ");
		int month=sc.nextInt();
		System.out.print("Enter year: ");
		int year=sc.nextInt();
		displayCalendar(month,year);
		
	}
}