package ProjectCWH;

import java.util.Scanner;

public class PracticeSet3 {

	public static void main(String[] args) 
	{
// Question1.What will be the output of this program: 

     /*     int a = 10;
          if (a=11)
           System.out.println(“I am 11”);
            else
          System.out.println(“I am not 11”);
     Ans - output is error syntax error (a=11)
    */
		
	/* Question 2 .Write a program to find out whether a student is pass or fail; if it requires a total of 40% and 
		    at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
		
		    double Math, Che, Phy;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter your marks in Physics");
		     Phy = sc.nextDouble();
		    System.out.println("Enter your marks in Mathematics");
		     Math = sc.nextDouble();
		    System.out.println("Enter your marks in Chemistry");
             Che = sc.nextDouble();
             
             double totalMarks = (Phy+Math+Che);
             double percentage = totalMarks/3;
             System.out.println(percentage);
		
		if(percentage>40 && Phy>33 &&  Math>33 && Che>33)
			System.out.println("Congratulation! You are passed ");
		else 
			System.out.println("Sorry ! You are failed");
		*/
		
		
	/*Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

			Income Slab	     Tax
			0 -  2.5l        0%
			2.5L – 5.0L  	 5%
			5.0L – 10.0L 	 20%
			Above 10.0L	     30%
			Note that there is not tax below 2.5L. Take the input amount as input from the user.
		*/	
		Scanner a = new Scanner(System.in);
	    
	    float Salary;
		System.out.println("Enter your CTC");
		Salary = a.nextFloat();
		float tax = 0;
		
		if(Salary<2.5f)
			{
			tax = tax + 0;
			}
		else if (Salary>=2.5f && Salary<5.0f)  
       		{
			 tax = tax + 0.05f *(Salary - 2.5f); // 5% tax = .05 
	     	}
	
		else if (Salary>=5.0f && Salary<10.0f)
		    {
			   tax = tax + 0.05f *(5.0f - 2.5f);  // 5% tax = .05 
			   tax = tax +  0.2f *(Salary - 5.0f); // 20% tax = .2 
		    }
		else if (Salary>10.0f)
		   {
			tax = tax + 0.05f*(5.0f-2.5f);             // 5% tax = .05 
			tax = tax + 0.2f * (10.0f - 5.0f);         // 20% tax = .2 
			tax = tax + 0.3f * (Salary-10.0f);         // 30% tax = .3 
	       }
		System.out.println("Your Calculate tax="+tax + "L");
	
	}

}
