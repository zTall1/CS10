/*

Program: ${Assignment13}.java          Date: ${May 5, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment13 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows the program to scan and save user input
		float PC1 = 0.30f; //creates a float variable = 0.30f
		float PC2 = 0.28f; //creates a float variable = 0.28f
		float PC3 = 0.27f; //creates a float variable = 0.27f
		float PC4 = 0.26f; //creates a float variable = 0.26f
		float PC5 = 0.25f; //creates a float variable = 0.25f
		System.out.println("Enter the number of copies to be printed: ");
		int copies = input.nextInt(); //creates variable, copies that is equal to user input
		
		
			if (copies <= 99) //creates a condition
		{
			System.out.println("Price per copy is: $" + PC1 //executes code only if the condition is true
			+ "		\r\n"
			+ "		\r\n"
			+ "Total cost is: $" + (PC1 * copies));
		}
			else if (copies >= 100 && copies <= 499) //creates a new condition
			{
				System.out.println("Price per copy is: $" + PC2  //executes code only if the condition is true
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC2 * copies));
			}
			else if (copies >= 500 && copies <= 749) //creates a new condition
			{
				System.out.println("Price per copy is: $" + PC3 //executes code only if the condition is true
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC3 * copies));
			}
			else if (copies >= 750 && copies <= 1000) //creates a new condition
			{
				System.out.println("Price per copy is: $" + PC4 //executes code only if the condition is true
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC4 * copies));
			}
			else //works only if previous conditions are inapplicable
			{
				System.out.println("Price per copy is: $" + PC5 //executes code
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC5 * copies));
			}
		
			
			


	}

}
