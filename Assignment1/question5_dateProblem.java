package Assignment1;
import java.util.Scanner;
public class question5_dateProblem {
	public static void main(String[] args) {
		int day,month,year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the day:");
		day=sc.nextInt();
		System.out.println("Enter the Month:");
		month=sc.nextInt();
		System.out.println("Enter the Year:");
		year=sc.nextInt();
		System.out.println("You Enter date is:"+day+"/"+month+"/"+year);
		int noOfDays[]= {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		day++;
		if(isLoopyear(year))
			noOfDays[2]=29;
		if(day>noOfDays[month]) {
			day=1;
			month++;
			if(month>12) {
				month=1;
				year++;
			}
		
		}
		System.out.println("the Next date is:"+day+"/"+month+"/"+year);
	}
	public static boolean isLoopyear(int year) {
		if((year%400==0 || year%100!=00)&&(year%4==0))
			return true;
		else
			return false;
	}

}
