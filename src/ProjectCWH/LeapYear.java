package ProjectCWH;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0   || year % 400 == 0) // && - and || or
		{
			System.out.println("This Year is LeapYear!");
		}
		else 
		{
			System.out.println("This Year is Not LeapYear!");
		}

	}

}
