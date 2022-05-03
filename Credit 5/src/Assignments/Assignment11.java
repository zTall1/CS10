package Assignments;

import java.util.Scanner;

public class Assignment11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any three digit number:");
		int number = input.nextInt();
		int dig1 = number/100;
		int dig2 = number%100/10;
		int dig3 = number%100%10;
		if (dig1 > dig2 && dig1 > dig3) 
		{
			System.out.println("The largest of the three digits is: " + dig1);
		}
		else if (dig2 > dig1 && dig2 > dig3) 
		{
			System.out.println("The largest of the three digits is: " + dig2);
		} 
		else 
		{
			System.out.println("The largest of the three digits is: " + dig3);
		}
		if (dig1 < dig2 && dig1 < dig3) 
		{
			System.out.println("The smallest of the three digits is: " + dig1);
		}
		else if (dig2 < dig1 && dig2 < dig3) 
		{
			System.out.println("The smallest of the three digits is: " + dig2);
		}
		else
		{
			System.out.println("The smallest of the three digits is: " + dig3);
		}
		System.out.println("The sum of the three digits is: " + (dig1 + dig2 + dig3));
		System.out.println("The product of the three digits is: " + (dig1 * dig2 * dig3));
		System.out.println("The average of the three digits is: " + (dig1 + dig2 + dig3) / 3);
	}
}
