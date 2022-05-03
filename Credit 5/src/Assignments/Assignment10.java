/*

Program: ${Assignment10}.java          Date: ${May 2, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment10 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows the program to scan and save user input
		System.out.println("Enter an integer:"); //prints Enter an integer:
		int num1 = input.nextInt(); //saves a variable for the user input
		String One = "Even"; //creates a string with the value Even
		String Two = "Odd"; //creates a string with the value Odd
		if (num1%2 == 0)  //creates a condition if (num1%2 == 0)
		{ 
			System.out.println(One); //prints One if the condition is correct
		}
		else
		{
			System.out.println(Two); //prints Two if the condition is false
		}
		
	}
}
/* Screen Dump
Enter an integer:
999
Odd

	 */