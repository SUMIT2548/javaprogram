package ProjectCWH;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) 
	{
		// Write a program to print first n odd numbers using a for loop.
		// even = number/2 = 0 , odd = number/2 =! 0; 
		// other process  2*i  = 2,4,6,8.. odd ,  2*i+1 =  3,5,7,9... even
		
	/*	int Num = 10;
	    for(int i=0; i<Num; i++)
	    {
	    	System.out.println("odd Number=" + (2*i+1));
	    }
	    for(int i=5; i!=0; i--)
	    {
            System.out.println(i);
	    }
	  */
           
		// Write a program to print first n natural numbers in reverse order.
	      
		  Scanner scanner = new Scanner(System.in);

	        // Input the value of n
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        // Print the first n natural numbers in reverse order
	        System.out.println("First " + n + " natural numbers in reverse order:");

	        for (int i = n; i >= 1; i--) {
	            System.out.print(i + " " );
	        }

	        // Close the scanner to avoid resource leak
	        scanner.close();
	    
	}

}
