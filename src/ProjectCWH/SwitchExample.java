package ProjectCWH;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args)
	{
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		switch(age)
		{
		case 18 :
		{
		    System.out.println("You are going to become an Adult!");
		    break;
		}
		case 23:
		{
			System.out.println("You are going to join a Job!");
			break;
		}
		case 28:
		{
			System.out.println("Married");
			break;
		}
		case 60:
		{
			System.out.println("You are going to get retired!");
			break;
		}
		
		default :
		{
			System.out.println("Enjoy Your life!");
			break;
		}

	    }
		System.out.println("GOD bless You");
	}
}
