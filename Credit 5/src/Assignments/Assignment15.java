/*

Program: ${Assignment14}.java          Date: ${May 18, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment15 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows program to scan and saves user input
		int rd = (int) (Math.random()*10 + 1);  //creates random number between 1-10
		int rd2 = (int) (Math.random()*10 + 1); //creates random number between 1-10
		System.out.println("what is " + rd + "*" + rd2 + "?" ); //forms a question using the two random integers
		int ans = input.nextInt(); //allows user to answer question only with an integer
		if (ans == rd*rd2) //creates a condition for if they get the question correct
			
		{
			System.out.println("Well done! Try again?"); //runs if they are correct
		}
		else
		{
			System.out.println("Incorrect... Try again!"); //runs if they are incorrect
		}
		
	


	}

}
/* Screen Dump
what is 8*6?
48
Well done! Try again?

	 */