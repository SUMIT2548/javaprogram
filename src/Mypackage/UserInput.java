package Mypackage;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		// How to Take user Input?
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Your name - ");
	System.out.println("Your age - ");
	System.out.println("Your Salary - ");
	
    String name = sc.nextLine();    // sc.nect print full line ex- i/p- sumit kumar saha, o/p- sumit kumar saha
  //String name = sc.next();      // sc.next only print first word. ex - i/p- sumit kumar saha, o/p - sumit
	
    int age = sc.nextInt();
	float salary = sc.nextFloat();
	
	System.out.println(name);
	System.out.println(age);
	System.out.println(salary);
	
	}

}
