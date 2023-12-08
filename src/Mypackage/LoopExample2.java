package Mypackage;

import java.util.Scanner;

public class LoopExample2 {
	public static void main(String[] args)
	{
		// while Loop
		
	  int i = 30;
	  while(i >= 1)
	  {
		  System.out.println(i);
		  i--;
	  }
        
	   // do- while loop 
	  int j = 50;
	  do 
	  {
		  System.out.println(j);
		  j --;
	  }
	while(j >= 1);
	  
Scanner sc = new Scanner(System.in);  
int number = 0;
do
{
	System.out.println("Input a Number");
	number = sc.nextInt();
	System.out.print("Here is your number : ");
	System.out.println(number);
}
while(number >= 0);

System.out.println("The End");	  
	  
	}

}
