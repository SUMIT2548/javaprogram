package ProjectCWH;

import java.util.Scanner;

public class PracticeSet3a {

	public static void main(String[] args) 
	{
 
 /* Question 4: Write a Java program to find out the day of the week given the number [1 for Monday, 
		              2 for Tuesday … and so on!]
     
		Scanner sc = new Scanner(System.in);
		
		int day ;
		System.out.println ("Choose the Number 1-7-");
		day = sc.nextInt();
		
			switch(day)
			{
			case 1 :
			{
				System.out.println("Monday");
				break;
			}
			case 2 :
			{
				System.out.println("Tuesday");
				break;
			}
			case 3 :
			{
				System.out.println("Wednesday");
				break;
			}
			case 4 :
			{
				System.out.println("Thursday");
				break;
			}
			case 5 :
			{
				System.out.println("Friday");
				break;
			}
			case 6 :
			{
				System.out.println("Saturday");
				break;
			}
			case 7:
			{
				System.out.println("Sunday");
				break;
			}
			
			}
	   */
	
/* Question 6:Write a program to find out the type of website from the URL:
              .com – commercial website
              .org – organization website
              .in – Indian website		
		*/
		Scanner sc = new Scanner(System.in);
		String WebSite;
		System.out.println("Enter The Website");
		WebSite = sc.nextLine();
		
		if(WebSite.endsWith(".com"))
		{
			System.out.println("Commercial WebSite");
		}
		else if (WebSite.endsWith(".org"))
		{
			System.out.println("organization Website");
		}
		else if (WebSite.endsWith(".in"))
		{
			System.out.println("Indian WebSite");
		}
		
	}

}
