// -------------------------------------------------------
// Assignment 3
// Written by: Lucas catchlove 27145640
// For COMP 248 Section (section U) – Winter 2020
// --------------------------------------------------------
/* This class allows for the creation of employee profiles 
   which include the name of the employee and the date they
   were hired and includes methods which allow for the
   modification and access of a given employees information as 
   well as the comparison between employees to determine seniority.
 */

public class Employee {
	String name;
	Date dateHired;
 
	//constructor 1
	public Employee() {
		name = "Jane Doe";
		dateHired = new Date();
	}
	//constructor 2
	public Employee(String aName, Date aDate) {
		name = aName; 
		dateHired = aDate; 

	}
	//determines which employee is the senior employee
	public int seniority(Employee e) {

		if(dateHired.year < e.dateHired.year)
			return -1;
		else if((dateHired.year == e.dateHired.year) && (dateHired.monthToInt(dateHired.month) < e.dateHired.monthToInt(e.dateHired.month)))
			return -1;
		else if(((dateHired.year == e.dateHired.year) && (dateHired.monthToInt(dateHired.month) == e.dateHired.monthToInt(e.dateHired.month))) && (dateHired.day < e.dateHired.day))
			return -1; 
		else if (((dateHired.year == e.dateHired.year) && (dateHired.monthToInt(dateHired.month) == e.dateHired.monthToInt(e.dateHired.month))) && (dateHired.day == e.dateHired.day))
			return 0; 
		else 
			return 1; 

	}
	

	//verifies if the two employees are the same (same name and hiring date)
	public boolean equals(Employee e) {
		if(name.equalsIgnoreCase(e.name) && dateHired.equalsDate(e.dateHired))
			return true; 
		else
			return false; 
	}

//accessors

	//returns the employees name
	public String getName() {
		return name; 
	}
	//returns the employees hiring date
	public Date getHireDate() {
		return dateHired; 
	}


//mutators

	//allows for the modification of the hiring date
	public void setHireDate(Date date) {
		dateHired = date;

	}
	//allows for the modification of the employees name
	public void setHireName(String name) {
		this.name = name; 

	}


}