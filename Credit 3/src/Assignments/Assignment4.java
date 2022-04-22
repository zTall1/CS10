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
		Scanner input = new Scanner(System.in); //scans and saves user input
		
		System.out.print("Diameter of the pizza in inches:"); //prints Diameter of the pizza in inches:
		int diameter = input.nextInt(); //collects user input for diameter
		
		double darkRed = (0.05*diameter*diameter)+0.75+1; //calculates the cost of the materials and stores it as the variable darkRed
		System.out.print("The cost of your pizza is: $" + darkRed); //displays The cost of your pizza is: $
		

	}

}
/* Screen Dump
Diameter of the pizza in inches: 19
The cost of your pizza is: $19.8
 */