package Assignments;

import java.util.Scanner;

public class Assignment17 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Please enter your GPA or -1 to quit the program");	
		Scanner userinput = new Scanner(System.in); //allows program to scan and saves user input
		double input = userinput.nextDouble();
		while(input != -1) 
		{
		
			if(input >= 3.8) 
			{
				System.out.println("Summa claude");
			}
		}
	
	}

}

