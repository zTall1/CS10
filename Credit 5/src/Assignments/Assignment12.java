/*

Program: ${Assignment12}.java          Date: ${May 4, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/

package Assignments;

import java.util.Scanner;

public class Assignment12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows the program to scan and save user input
		System.out.println("Enter a grade perentage: "); //prints Enter a grade perentage: 
		int grade = input.nextInt(); //saves a variable for the user input
		System.out.println(" ");
		if (grade >= 90)  //creates a condition
		{
			System.out.println("Your grade is A+"); //prints Your grade is A+, if the condition is true
		}
		else if (grade >= 80)  //creates a new condition
		{
			System.out.println("Your grade is A");  //prints Your grade is A, if the condition is true
		}
		else if (grade >= 75)  //creates a new condition
		{
			System.out.println("Your grade is B+"); //prints Your grade is B+, if the condition is true
		}
		else if (grade >= 70)  //creates a new condition
		{
			System.out.println("Your grade is B");  //prints Your grade is B, if the condition is true
		}    
		else if (grade >= 65)  //creates a new condition
		{
			System.out.println("Your grade is C+"); //prints Your grade is C+, if the condition is true
		}
		else if (grade >= 60)  //creates a new condition
		{
			System.out.println("Your grade is C");  //prints Your grade is C, if the condition is true
		}
		else if (grade >= 55)  //creates a new condition
		{
			System.out.println("Your grade is D+"); //prints Your grade is D+, if the condition is true
		}
		else if (grade >= 50)  //creates a new condition
		{
			System.out.println("Your grade is D");  //prints Your grade is D, if the condition is true
		}
		else if (grade < 50)  //creates a new condition
		{
			System.out.println("Your grade is F");  //prints Your grade is F, if the condition is true
		}
		
	}

}
/* Screen Dump
Enter a grade perentage: 
100
 
Your grade is A+


	 */