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
		Scanner input = new Scanner(System.in);
		float PC1 = 0.30f;
		float PC2 = 0.28f;
		float PC3 = 0.27f;
		float PC4 = 0.26f;
		float PC5 = 0.25f;
		System.out.println("Enter the number of copies to be printed: ");
		int copies = input.nextInt();
		
		
			if (copies <= 99) 
		{
			System.out.println("Price per copy is: $" + PC1
			+ "		\r\n"
			+ "		\r\n"
			+ "Total cost is: $" + (PC1 * copies));
		}
			else if (copies >= 100 && copies <= 499)
			{
				System.out.println("Price per copy is: $" + PC2 
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC2 * copies));
			}
			else if (copies >= 500 && copies <= 749)
			{
				System.out.println("Price per copy is: $" + PC3
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC3 * copies));
			}
			else if (copies >= 750 && copies <= 1000)
			{
				System.out.println("Price per copy is: $" + PC4
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC4 * copies));
			}
			else 
			{
				System.out.println("Price per copy is: $" + PC5
				+ "		\r\n"
				+ "		\r\n"
				+ "Total cost is: $" + (PC5 * copies));
			}
		
			
			


	}

}
