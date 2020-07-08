// -------------------------------------------------------
// Assignment 3
// Written by: Lucas catchlove 27145640
// For COMP 248 Section (section U) – Winter 2020
// --------------------------------------------------------
/* This class stores information pertaining to a given date 
	(after the date is validated) and includes methods that
	allow for the access, modification of a given date as
	well as the comparison between two dates.
 */

public class Date {

	int day; 
	String month;
	int year; 


    //constructor 1
	public Date() {
		day = 1;
		month = "January";
		year = 2000; 

	}



    //constructor 2
	public Date(String monthString, int day, int year) {
		if(dateOK(monthString, day, year) == true) {
			month = monthString;
			this.day = day; 
			this.year = year; 

		}
		else {
			System.out.println("Invalid date. exiting...");
			System.exit(0);  
		}
	}



    //constructor 3
	public Date(int monthInt, int day, int year) {
		if(dateOK(monthInt, day, year) == true) {
			month = monthToString(monthInt);
			this.day = day; 
			this.year = year; 
		}
		else {
			System.out.println("Invalid date. exiting...");
			System.exit(0); 
		}


	}




    // date validation for constructor 2
	private boolean dateOK(String monthString, int day, int year) {
		int monthInt = monthToInt(monthString);
		if(day > 29 && monthInt == 2)
			return false; 
		else if(((day == 29) && (monthInt == 2)) && leap(year)==false)
			return false; 
		else if(((day == 29) && (monthInt == 2)) && leap(year)==true)
			return true; 
		else if(((day >=1 && day <=31) && (monthInt >= 1 && monthInt <= 12)) && (year >= 1000 && year <=9999))
			return true;
		else 
			return false; 


	}


    //date validation for constructor 3
	private boolean dateOK(int monthInt, int day, int year){
		if(day > 29 && monthInt == 2)
			return false; 
		else if(((day == 29) && (monthInt == 2)) && leap(year)==false)
			return false; 
		else if(((day == 29) && (monthInt == 2)) && leap(year)==true)
			return true; 
		else if(((day >=1 && day <=31) && (monthInt >= 1 && monthInt <= 12)) && (year >= 1000 && year <=9999))
			return true;
		else 
			return false; 
	}






    //checks if the inputted year is a leap year 
	private boolean leap(int year) {
		if((year%4==0 && year%100!=0) || (year%400==0))
			return true;
		else 
			return false; 

	}




    //checks if two dates are the same
	public boolean equalsDate(Date otherDate) {
		if(((day == otherDate.day) && (month.equals(otherDate.month) == true)) && (year == otherDate.year))
			return true; 
		else 
			return false; 
	}



    //sets the date with the month being an interger value 
	public void setDate(int monthInt, int day, int year) {
		if(dateOK(monthInt, day, year) == true) {
			month = monthToString(monthInt);
			this.day = day; 
			this.year = year; 
		}
		else {
			System.out.print("Invalid date. exiting...");
			System.exit(0); 
		}
	}


	//sets the date with the month being a string value 
	public void setDate(String monthString, int day, int year) {
		if(dateOK(monthString, day, year) == true) {
			month = monthString;
			this.day = day; 
			this.year = year; 

		}
		else {
			System.out.print("Invalid date. exiting...");
			System.exit(0);  
		}
	}







    //converts a given months integer value to a string value
	public String monthToString(int monthInt) {
		switch (monthInt) {
			case 1: 
			return "January";

			case 2:
			return "February"; 

			case 3: 
			return "March";  

			case 4:
			return "April";

			case 5:
			return "May";

			case 6: 
			return "June"; 

			case 7: 
			return "July"; 

			case 8: 
			return "August";

			case 9: 
			return "September";

			case 10:
			return "October";

			case 11:
			return "November";

			case 12: 
			return "December";

			default: return "invalid parameter";
		}



	}

	//converts a given months string value to an integer value
	public int monthToInt(String monthString) {

		switch (monthString) {
			case "January": 
			return 1;

			case "February":
			return 2; 

			case "March": 
			return 3;  

			case "April":
			return 4;

			case "May":
			return 5;

			case "June": 
			return 6; 

			case "July": 
			return 7; 

			case "August": 
			return 8;

			case "September": 
			return 9;

			case "October":
			return 10;

			case "November":
			return 11;

			case "December": 
			return 12;

			default: return 0;
		}


	}

//mutators


    //allows for the modification of the current day 
	public void setDay(int day) {
		if(dateOK(month, day, year) == true)
			this.day = day; 
		else {
			System.out.println("Invalid date. exiting...");
			System.exit(0); 
		}
	}
	//allows for the modification of the current month value (using an int as a parameter)
	public void setMonth(int monthInt) {
		if(dateOK(monthInt, day, year) == true)
			this.month = monthToString(monthInt);
		else {
			System.out.println("Invalid date. exiting...");
			System.exit(0);
		} 
	}
	//allows for the modification of the current month value (using a string as parameter)
	public void setMonth(String monthString) {
		if(dateOK(monthString, day, year) == true)
			this.month = monthString;
		else {
			System.out.println("Invalid date. exiting...");
			System.exit(0); 
		}


	}
	//allows for the modification of the current year value
	public void setYear(int year) {
		if(dateOK(month, day, year) == true)
			this.year = year;
		else {
			System.out.println("Invalid date. exiting...");
			System.exit(0);  
		}
	}


//accessors


	//returns the day 
	public int getDay() {
		return day; 
	}

	//returns the month
	public int getMonth() {
		return monthToInt(month);
	}


	//returns the year
	public int getYear() {
		return year; 
	}


	
}