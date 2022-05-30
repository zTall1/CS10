/*

Program: ${Assignment17}.java          Date: ${May 19, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment17 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Please enter your GPA or -1 to quit the program");	
		Scanner userinput = new Scanner(System.in); //allows program to scan and saves user input
		double input = userinput.nextDouble();
		while(input != -1) //creates a loop
		{
		
			if (input < 0 || input > 4) //sets a range to the accepted gpas
	       	{
	        	System.out.println("This GPA doesn't exist.");
	        	System.out.println("Enter another gpa, or type -1 to leave:");
	        	input = userinput.nextDouble();
	        	
	       	}
	       	else if  (input >= 3.8 && input <= 4.00 ) //checks if the user's gpa qualify for a certain honors distinction
	       	{
	        	System.out.println("summa cum laude");
	        	System.out.println("Enter another gpa, or type -1 to leave:");
	        	input = userinput.nextDouble();
	       	}     	 
	  	 
	       	else if (input >= 3.65 && input <= 3.80) //checks if the user's gpa qualify for a certain honors distinction
	       	{
	        	System.out.println("magna cum laude");
	        	System.out.println("Enter another gpa, or type -1 to leave:");
	        	input = userinput.nextDouble();
	       	}
	  	 
	       	else if (input <= 3.64 && input >= 3.5) //checks if the user's gpa qualify for a certain honors distinction
	       	{
	        	System.out.println("cum laude");
	        	System.out.println("Enter another gpa, or type -1 to leave:");
	        	input = userinput.nextDouble();
	       	}
	  	 
	       	else  //since previous conditions are false prints they do not qualify
	       	{
	        	System.out.println("Sorry, at this you did not qualify for an honors distinction.");
	        	System.out.println("Enter another gpa, or type -1 to leave:");
	        	input = userinput.nextDouble();
	       	}
	  	 
	             	 
		}
	  	 
				System.out.println("Thank you for taking the time to use our service; have a wonderful day!");
				
	}
	
}
/* Screen Dump
Please enter your GPA or -1 to quit the program
4.0
summa cum laude
Enter another gpa, or type -1 to leave:
-1
Thank you for taking the time to use our service; have a wonderful day!


	 */


