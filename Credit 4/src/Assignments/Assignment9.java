/*

Program: ${Assignment9}.java         Date: ${April 29, 2022}


Author: Isaac Daodu
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment9 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows the program to scan and save user input
		System.out.println("Enter an integer:"); //prints Enter an integer
		int num1 = input.nextInt(); //saves user input as the int num1
		System.out.println("Enter a second integer:"); //prints Enter a second integer
		int num2 = input.nextInt(); //saves user input as the int num2
		int Ans1 = num1/num2; //creates a variable by dividing the two inputs
		int Rem1 = num1%num2; //creates a variable = to the remainder of the previous operation
		int Ans2 = num2/num1;//creates a variable by dividing the two inputs
		int Rem2 = num2%num1; //creates a variable = to the remainder of the previous operation
		System.out.println(num1 + "/" + num2 + " = " + Ans1 //combines the variables to create num1/num2 = Ans1
				+ "     \r\n"		//creates a space
				+ "     \r\n"		//creates a space
				+ num1 + "%" + num2 + " = " + Rem1 //combines the variables to create num1%num2 = Rem1
				+ "     \r\n"		//creates a space
				+ "     \r\n"		//creates a space
				+ "     \r\n"		//creates a space
				+ "     \r\n"		//creates a space
				+ num2 + "/" + num1 + " = " + Ans2 //combines the variables to create num2/num1 = Ans2
				+ "     \r\n"		//creates a space
				+ "     \r\n"		//creates a space
				+ num2 + "%" + num1 + " = " + Rem2 //combines the variables to create num2%num1 =  Rem2
				);
		

	}

}
/* Screen Dump
Enter an integer:
21
Enter a second integer:
9
21/9 = 2     
     
21%9 = 3     
     
     
     
9/21 = 0     
     
9%21 = 9

	 */