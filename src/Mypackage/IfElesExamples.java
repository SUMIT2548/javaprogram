package Mypackage;

import java.util.Scanner;

public class IfElesExamples
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter your age");
		 int age = sc.nextInt();
		 if(age > 18)
			 System.out.println("can vote");
		 else
			 System.out.println(" can't vote ");
		 
		 boolean isSunUp = true;
		 if(isSunUp == true)
			 System.out.println("day");
		 else 
		     System.out.println("night"); 
	}

}
