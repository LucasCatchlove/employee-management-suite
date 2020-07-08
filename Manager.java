// -------------------------------------------------------
// Assignment 3
// Written by: Lucas catchlove 27145640
// For COMP 248 Section (section U) – Winter 2020
// --------------------------------------------------------
/* This program allows the user to create employees and 
assign them names and hiring dates. The user is then able to
compare the employees seniority, employee profiles, and print out
the information contained in the profile for the user to see. 
 */

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {

		System.out.println("*****************************************\n" +
				"        Employee Management Suite           \n" + 
				"*****************************************\n"); 

		Scanner kb = new Scanner(System.in);

		//creates two intances of the Employee class
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		
		//prompts user for name and hiring date of employee 1 and 2
		System.out.print("enter name of employee 1: ");
		e1.name = kb.next();

		System.out.print("enter day that " + e1.name + " started: ");
		e1.dateHired.setDay(kb.nextInt());
		System.out.print("enter the month (1 to 12) that " + e1.name + " started: ");
		e1.dateHired.setMonth(kb.nextInt());
		System.out.print("enter the year that " + e1.name + " started: ");
		e1.dateHired.setYear(kb.nextInt());


		System.out.print("\nenter name of employee 2: ");
		e2.name = kb.next();

		System.out.print("enter day that " + e2.name + " started: ");
		e2.dateHired.setDay(kb.nextInt());
		System.out.print("enter the month (1 to 12) that " + e2.name + " started: ");
		e2.dateHired.setMonth(kb.nextInt());
		System.out.print("enter the year that " + e2.name + " started: ");
		e2.dateHired.setYear(kb.nextInt());


		//prints out name and hiring date of employees
		System.out.println("\nThe first employee (e1): \n" + e1.name + " " + e1.dateHired.month + " " + e1.dateHired.day + ", " + e1.dateHired.year + "\n");
		System.out.println("\nThe second employee (e2): \n" + e2.name + " " + e2.dateHired.month + " " + e2.dateHired.day + ", " + e2.dateHired.year + "\n");


		//determines employee senority and prints out result
		if(e1.seniority(e2) == -1)
			System.out.println(e1.name + " is more senior than " + e2.name + "\n");
		else if (e1.seniority(e2) == 1)
			System.out.println(e2.name + " is more senior than " + e1.name + "\n");
		else 
			System.out.println("Both employees were hired on the same day\n");


		//creates another instance of employee 2
		Employee e3 = new Employee();
		e3.dateHired = e1.dateHired;
		e3.name = e1.name; 

		System.out.println("The duplicated employee (e3): \n" + e3.name + " " + e3.dateHired.month + " " + e3.dateHired.day + ", " + e3.dateHired.year + "\n");


		//determines if employees are equal using the == operator and a predefined function
		System.out.println("e1.equals(e3) => " + e1.equals(e3));
		System.out.println("e2.equals(e3) => " + e2.equals(e3) + "\n");

		System.out.println("(e1 == e3) => " + (e1==e3));
		System.out.println("(e2 == e3) => " + (e2==e3) + "\n");

		System.out.println("Thank you for using Employee Management Suite! Goodbye!\n");

		


	}
	
}

