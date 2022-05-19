package Assignments;

import java.util.Scanner;

public class Assignment16 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number from 1 and 20");
		Scanner input = new Scanner(System.in); //allows program to scan and saves user input
		int compnum = (int) (Math.random()*20 + 1);  //creates random number between 1-20
		int playerguess = input.nextInt();
		System.out.println("Player's number: " + playerguess);
		System.out.println("Computer's number: " + compnum);
		if (compnum == playerguess) 
		{
			System.out.println("You got it!");
		}
		else
		{
			System.out.println("Better luck next time....");
		}

	}

}
