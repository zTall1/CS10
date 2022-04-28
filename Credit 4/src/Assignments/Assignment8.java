package Assignments;
/*

Program: ${Assignment8}.java          Date: ${April 28, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
import java.util.Scanner;

public class Assignment8 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //scans and saves user input
		System.out.println("Enter a two digit number:"); //prints Enter a two digit number:
		int twodnumber = input.nextInt(); //stores and creates an int from user input
		int hundreds = twodnumber/100; //divides user input by 100 to get the amount of hundreds
		int tens = twodnumber%100/10; //divides the remainder by 10 to get the tens
		int ones = twodnumber%100%10; //stores the remainder as ones
		System.out.println("Hundreds: " + hundreds //prints hundreds
		+ "     \r\n"		//creates a space
		+ "Tens: " + tens //prints tens
		+ "     \r\n"	    //creates a space
		+ "Ones:" + ones //prints ones
		+ "     \r\n" //creates a space
				
				);
	}

}
/* Screen Dump
Enter a two digit number:
999
Hundreds: 9     
Tens: 9     
Ones:9   

	 */