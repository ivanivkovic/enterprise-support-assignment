public class Main
{ 
	public static void main(String[] args){

		// Valid cases
		System.out.println("The year 1600 is" + (Calendar.isLeapYear(1600) ? "" : " not") + " leap!");
		System.out.println("The year 2017 is" + (Calendar.isLeapYear(2017) ? "" : " not") + " leap!");
		System.out.println("The year 2000 is" + (Calendar.isLeapYear(2000) ? "" : " not") + " leap!");
		
		// Invalid cases
		System.out.println("The year -1600 is" + (Calendar.isLeapYear(-1600) ? "" : " not") + " leap!");
		System.out.println("The year 12194 is" + (Calendar.isLeapYear(12194) ? "" : " not") + " leap!");
	
		// Valid cases
		System.out.println("Number of days in February 2020 is: " + Calendar.getDaysInMonth(2, 2020));
		System.out.println("Number of days in February 2021 is: " + Calendar.getDaysInMonth(2, 2021));
		System.out.println("Number of days in January 2019 is: " + Calendar.getDaysInMonth(1, 2019));

		// Invalid cases
		System.out.println("Number of days in month: -1, year: 2019 is: " + Calendar.getDaysInMonth(-1, 2019));
		System.out.println("Number of days in month: 6, year: -2019 is: " + Calendar.getDaysInMonth(6, -2019));
		System.out.println("Number of days in month: 6, year: 10000 is: " + Calendar.getDaysInMonth(6, 10000));

		// Display test GUI
		CalendarDialog dialog = new CalendarDialog();
		dialog.displayDialog();
	}
}
