/*

Program: ${Assignment16}.java          Date: ${May 19, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment16 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number between 1 and 20");
		Scanner input = new Scanner(System.in); //allows program to scan and saves user input
		int compnum = (int) (Math.random()*20 + 1);  //creates random number between 1-20
		int playerguess = input.nextInt(); //user input
		System.out.println("Player's number: " + playerguess); //displays player number	
		System.out.println("Computer's number: " + compnum); //displays computer number
		if (compnum == playerguess) //creates a condition
		{
			System.out.println("You got it!"); //executes if condition is true
		}
		else
		{
			System.out.println("Better luck next time...."); //executes if condition is false
		}

	}

}
/* Screen Dump
Enter a number between 1 and 20
13
Player's number: 13
Computer's number: 14
Better luck next time....

	 */