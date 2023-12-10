package Mypackage;
import java.util.Scanner;
public class miniProject2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double num1 , num2 , result ;
		int option;
		
		while(true)
		{
		System.out.println("Enter Two Number: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		System.out.println("Enter your Option: ");
		option = sc.nextInt();
		
		if(option == 1)
		   {
			result = num1+num2;
			System.out.println("result of sum = " + result);
			//break;
		   }
		else if(option == 2)
		   {
			result = num1 - num2;
			System.out.println("result of sub = " + result);
			//break;
		   }
		else if(option == 3)
		{
			result = num1 * num2;
			System.out.println("result of multi = "+ result);
			//break;
		}
		else if(option == 4)
		{
			result = num1 / num2;
			System.out.println("result of div = "+ result);
			System.out.println("The End");
			break;
		}
		else
		{
			System.out.println("Enter worng choice");
			System.out.println("The End");
			break;
		}
		
	    }
     }
}
