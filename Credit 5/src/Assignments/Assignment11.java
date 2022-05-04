/*

Program: ${Assignment11}.java          Date: ${May 3, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows the program to scan and save user input
		System.out.println("Enter any three digit number:"); //prints Enter any three digit number:
		int number = input.nextInt(); //saves a variable for the user input
		int dig1 = number/100; //saves a variable = number/100
		int dig2 = number%100/10; //saves a variable = number%100/10
		int dig3 = number%100%10; //saves a variable = number%100%10
		if (dig1 > dig2 && dig1 > dig3) //creates a condition
		{
			System.out.println("The largest of the three digits is: " + dig1); // if the condition is true it prints, The largest of the three digits is: and dig1
		}
		else if (dig2 > dig1 && dig2 > dig3) //creates a new condition
		{
			System.out.println("The largest of the three digits is: " + dig2); // if the condition is true it prints, The largest of the three digits is:  and dig2
		} 
		else 
		{
			System.out.println("The largest of the three digits is: " + dig3); // if both conditions are false it prints, The largest of the three digits is: and dig3
		}
		System.out.println(" ");
		if (dig1 < dig2 && dig1 < dig3)  //creates a condition
		{
			System.out.println("The smallest of the three digits is: " + dig1); // if the condition is true it prints, The smallest of the three digits is: and dig1
		}
		else if (dig2 < dig1 && dig2 < dig3) //creates a new condition
		{
			System.out.println("The smallest of the three digits is: " + dig2); // if the condition is true it prints, The smallest of the three digits is:  and dig2
		}
		else
		{
			System.out.println("The smallest of the three digits is: " + dig3); // if both conditions are false it prints, The smallest of the three digits is: and dig3
		}
		
		System.out.println(" ");
		
		System.out.println("The sum of the three digits is: " + (dig1 + dig2 + dig3) //prints the sum of dig1, dig2, & dig3
				+ "  \r\n"
				+ "   \r\n"
				+ "The product of the three digits is: " + (dig1 * dig2 * dig3) //prints the product of dig1, dig2, & dig3
				+ "   \r\n"
				+ "   \r\n"
				+ "The average of the three digits is: " + (dig1 + dig2 + dig3) / 3); //prints the mean of dig1, dig2, & dig3
	}
}
/* Screen Dump
Enter any three digit number:
123
The largest of the three digits is: 3
 
The smallest of the three digits is: 1
 
The sum of the three digits is: 6  
   
The product of the three digits is: 6   
   
The average of the three digits is: 2

	 */