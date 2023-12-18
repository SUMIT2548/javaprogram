//1.Write a program to sum three numbers in Java.
//2.Write a program to calculate CGPA using marks of three subjects (out of 100)
//3.Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
//4.Write a Java program to convert Kilometers to miles.
//5.Write a Java program to detect whether a number entered by the user is an integer or not.


package ProjectCWH;

import java.util.Scanner;

public class PracticeSet {

	public static void main(String[] args)
	{
	    /*Question -1
		     int a= 75;
		     int b = 85;
		     int c = 80;
		     int Sum =(a+b+c);
		     System.out.println(Sum);   */
		
		  /*Question -2 
		      double math = 65;
		      double eng = 72;
		      double phy = 70;
		      double Cpga = (math+eng+phy)/30 ;
		      System.out.println("Total CGPA =" +Cpga); */  
		
		/*Question - 3   
		    Scanner sc = new Scanner(System.in);
		    System.out.println("what is your Name");
		    String Name = sc.nextLine();
		    System.out.println("Hello " + Name + ", Have a good day");*/
		
        /*Question - 4
	          Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the kilomerter");
		      double Kilo = sc.nextDouble();
		      double miles = Kilo/1.609 ;  // Formula	for an approximate result, divide the length value by 1.609
		      System.out.println("Number of miles = " +miles);*/
		
		// Question -5 
		      Scanner sc = new Scanner(System.in);
	          System.out.println("Enter the Number");
		      boolean Number = sc.hasNextInt();
		      System.out.println("The Number is integer " +Number);	
    }

}
