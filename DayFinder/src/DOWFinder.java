import java.util.Scanner;

public class DOWFinder {
	
	public static String findDOW(int day,int month,int year) {
		
		if(year<1900 || year>2100) {
			
			return "Please choose year between 1900-2100";
		}
		
		int daysFromYear = (year-1900)*365;
		int leapYearDays = (year-1900)/4;
		int currentYearDays = 0;
		
		switch(month) {
		
		case 12: currentYearDays+=30;
		case 11: currentYearDays+=31;
		case 10: currentYearDays+=30;
		case 9: currentYearDays+=31;
		case 8: currentYearDays+=31;
		case 7: currentYearDays+=30;
		case 6: currentYearDays+=31;
		case 5: currentYearDays+=30;
		case 4: currentYearDays+=31;
		case 3: currentYearDays+=28;
		case 2: currentYearDays+=31;
		default: currentYearDays+=0; //Not really needed
		break;
		
	    }
		
		currentYearDays += day;
		
		if(year%4==0 && month <= 2) {
			leapYearDays-=1;
		}
		
		int totalDays = daysFromYear + leapYearDays + currentYearDays;
		int dayOfWeek = totalDays%7;
		
		String dow;
		
		
		// Could have created a string array
		// String days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
		// return days[dayOfWeek];
		switch(dayOfWeek) {
			case 0: dow = "Sunday";
			break;
			case 1: dow = "Monday";
			break;
			case 2: dow = "Tuesday";
			break;
			case 3: dow = "Wednesday";
			break;
			case 4: dow = "Thursday";
			break;
			case 5: dow = "Friday";
			break;
			case 6: dow = "Saturday";
			break;
			default: dow = "Sunday";
			break;
		}
		
		return dow;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Day");
		int day = scanner.nextInt();
		System.out.println("Enter Month");
		int month = scanner.nextInt();
		System.out.println("Enter Year");
		int year = scanner.nextInt();
		System.out.println(findDOW(day,month,year));
		scanner.close();
	}

}
