/*

Program: ${Assignment14}.java          Date: ${May 10, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment14 
{

	public static void main(String[] args) 
	{
		System.out.println("Please enter your age: ");
		Scanner input = new Scanner(System.in); //allows the program to scan and save user input
		int age = input.nextInt(); //creates a variable that is equal to the user input, integers are the accepted value
		if (age <= 5) //creates a condition
		{
			System.out.println("You are a toddler"); //prints code if condition is applicable
		}
		else if (age <= 10 && age > 5)   //creates a new condition
		{
			System.out.println("You are a child"); //prints code if condition is applicable
		}
		else if (age <= 12 && age > 10)  //creates a new condition
		{
			System.out.println("You are a pre-teen"); //prints code if condition is applicable
		}
		else if (age <= 18 && age > 12)  //creates a new condition
		{
			System.out.println("You are a teen"); //prints code if condition is applicable
		}
		else //applies if previous conditions are false
		{
			System.out.println("You are an adult"); //prints You are an adult
		}


	}

}
/* Screen Dump
Enter a grade perentage: 
100
 
Your grade is A+


	 */