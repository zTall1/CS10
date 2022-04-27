package Assignments;
/*

Program: ${Assignment7}.java          Date: ${April 27, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
import java.util.Scanner;

public class Assignment7 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //scans and saves user input
		System.out.println("Enter the change in cents: "); //prints Enter the change in cents:
		int change = input.nextInt(); //collects and saves user input for the int change
		int quarters = change/25; //calculates quarters by dividing change by 25
		int dimes = (change%25)/10; //calculates dimes by dividing 10 from the remainder of change/25
		int nickels = ((change%25)%10)/5; //calculates nickels by dividing 5 from the remainder of change/25/10
		int pennies = ((change%25)%10)%5; //stores the remainder of change/25/10/5 as the int pennies
		System.out.println("You have " + change + " cents"); //prints a combination of text and a variable
		System.out.println(" \r\n" //creates a space
				+ "  \r\n" //creates a space
				+ "The minimum number of coins is:\r\n" //print The minimum number of coins is:
				+ "         \r\n" //creates a space
				+ " Quarters:" + quarters //print quarters:
				+ "     \r\n" //creates a space
				+ "     \r\n" //creates a space
				+ " Dimes:" + dimes //print dimes:
				+ "     \r\n" //creates a space
				+ "     \r\n" //creates a space
				+ " Nickels:" + nickels //print nickels:
				+ "     \r\n" //creates a space
				+ "     \r\n" //creates a space
				+ " Pennies:" + pennies //prints amount of pennies
				+ "     \r\n"); //creates a space
	}

}
/* Screen Dump
Enter the change in cents: 
567
You have 567 cents
 
  
The minimum number of coins is:
         
 Quarters:22     
     
 Dimes:1     
     
 Nickels:1     
     
 Pennies:2     

	 */