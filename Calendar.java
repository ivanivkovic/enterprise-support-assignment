public class Calendar
{
	private static short[] daysInMonth = new short[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/**
	 * Identifies whether a year is a leap year or not
	 *
	 * @param year year to check if it's a leap year
	 *
	 * @return boolean - leap year or not 
	 */
	public static boolean isLeapYear(int year){

		if(year > 0 && year <= 9999){
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				return true;
			}
		} 

	 	return false;
	}

	/**
	 * Returns the days in a month
	 *
	 * @param month month to check the days for
	 * @param year year to identify leap years
	 * 
	 * @return days in month
	 */
	public static int getDaysInMonth(int month, int year){
		
		if(month > 0 && month <= 12 && year > 0 && year <= 9999){
	
			// Native solution
			// import java.time.YearMonth;
			// YearMonth yearMonthObject = YearMonth.of(year, month);
			// return yearMonthObject.lengthOfMonth();	
			
			// Manual solution
			int leapYearDay = month == 2 && isLeapYear(year) ? 1 : 0;

			return daysInMonth[month-1] + leapYearDay;
		}

		return -1;
	}
}
