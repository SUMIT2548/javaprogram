package Mypackage;

import java.util.Scanner;

public class ConditionalStatement1 {

	public static void main(String[] args)
	{
		// Else-if
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter The Cash");
	  int cash = sc.nextInt();
	  
	  if(cash<15)
	  {
		  System.out.println("Cannot buy anyting");
		  System.out.println("Get more cash");
	  }
	  
	  else if(cash>15 && cash<40)
	  {
		  System.out.println("buy 1");
	  }
	  else if(cash>50 && cash<70)
	  {
		  System.out.println("buy 2");
	  }
	  else
	  {
		  System.out.println("buy 3");
	  }
		  
	}

}
