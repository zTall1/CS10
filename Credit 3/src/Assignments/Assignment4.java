package Assignments;

import java.util.Scanner;

/*

Program: ${Assignment4}.java          Date: ${April 14, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
public class Assignment4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Diameter of the pizza in inches:");
		int red = input.nextInt();
		
		double darkRed = ((0.05*red*red)+0.75+1);
		System.out.print("The cost of your pizza is: $" + darkRed);
		

	}

}
/* Screen Dump
Diameter of the pizza in inches: 19
The cost of your pizza is: $19.8
 */