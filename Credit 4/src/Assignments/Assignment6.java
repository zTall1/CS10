package Assignments;
/*

Program: ${Assignment6}.java          Date: ${April 21, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
import java.util.Scanner;

public class Assignment6 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String FN = input.nextLine();
		System.out.println("What is your last name?");
		String LN = input.nextLine();
		System.out.println("What grade are you in?");
		int Grade = input.nextInt();
		System.out.println("What school do you attend?");
		String HS = input.nextLine();
		HS += input.nextLine();
		System.out.println("What is your favourite hobby?");
		String HOB = input.nextLine();
		System.out.println("Hello your name is " + FN + " " + LN + ", you are currently in grade " + Grade + " at " + HS + " " + "and your favourite hobby is " + HOB);

		


	}

}
/* Screen Dump
What is your first name?
Isaac
What is your last name?
Daodu
What grade are you in?
10
What school do you attend?
Crescent Heights
What is your favourite hobby?
Sports
Hello your name is Isaac Daodu, you are currently in grade 10 at Crescent Heights and your favourite hobby is Sports

	 */