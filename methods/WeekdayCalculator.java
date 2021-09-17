
import java.util.Scanner;

public class WeekdayCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();

		System.out.println("What's your birthday?");
		System.out.print("Birth date (dd mm yyyy): ");
		int dd = keyboard.nextInt();
		int mm = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		System.out.println("You were born on " + weekday(dd, mm, yyyy));

		keyboard.close();
	}

	public static String weekday(int dd, int mm, int yyyy) {
		int yy, total;
		String date = "";

		yy = yyyy - 1900;
		int offset = monthOffset.month_offset(mm);
		total = ((yy / 4 + yy) + dd) + offset - 1;

		if (is_leap(yyyy) && mm < 3) {
			total--;
		}

		date = weekday_name(total % 7) + ", " + dd + " " + monthName.month_name(mm) + " " + yyyy;

		return date;
	}

	// paste your functions from MonthName, WeekdayName, and MonthOffset here

	private static String weekday_name(int remainder) {

		String dayOfTheWeek = "";

		switch (remainder) {
			case 1:
				dayOfTheWeek = "Monday";
				break;
			case 2:
				dayOfTheWeek = "Tuesday";
				break;
			case 3:
				dayOfTheWeek = "Wednesday";
				break;
			case 4:
				dayOfTheWeek = "Thursday";
				break;
			case 5:
				dayOfTheWeek = "Friday";
				break;
			case 6:
				dayOfTheWeek = "Saturday";
				break;
			case 7:
				dayOfTheWeek = "Sunday";
				break;
			default:
				dayOfTheWeek = " none ";

		}

		return dayOfTheWeek;
	}

	public static boolean is_leap(int year) {
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if (year % 400 == 0)
			result = true;
		else if (year % 100 == 0)
			result = false;
		else if (year % 4 == 0)
			result = true;
		else
			result = false;

		return result;
	}
}
