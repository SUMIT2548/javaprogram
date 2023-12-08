package Mypackage;

import java.util.Scanner;

public class LoopExample1 {

	public static void main(String[] args)
	{
		// FOR Loop 
		
 	Scanner sc = new Scanner(System.in);
 	
	System.out.println("Enter the number x == ");	
	for (int x = sc.nextInt(); x<=100; x++ )
	{
		System.out.println(x);
	} 
	
  /*  int i;
	for(i = 1; i <= 100; i++) 
	  {
		System.out.println(i);
	  }*/
	
	for(int t= 100; t >= 1 ; t-- )
	{
		System.out.println(t);
	}
	
	
	}

}
