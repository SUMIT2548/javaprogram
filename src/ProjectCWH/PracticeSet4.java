package ProjectCWH;

public class PracticeSet4 {

	public static void main(String[] args)
	{
	/*	Question 1: Write a program to print the following pattern :
			****
			***
			**
			*
		       int n = 4;
               for (int i=n; i>0; i--)
              {
               for(int j=0;j<i;j++)
              {
                 System.out.print("*");
              }
                System.out.print("\n");
              }
      */     
  
	//Question 2: Write a program to sum first n even numbers using a while loop.  
           
         /*      int n =10; // first 10 even number
                 int a = 0;
                 int sum = 0;
                 while(a<=n)
               {
        	     sum= sum + (2*a);
        	     a++;
               }
                 System.out.println("sum of first 10even number="  +sum);   
         */  
           
     //Question 3: Write a program to print the multiplication table of a given number n.
           
          /*       int N = 4;
                   for(int i=0; i<8; i++)
                 {
            	   System.out.println("multiplication N * i =" + N*i);         
                 }
         */
		
	//Question 4: Write a program to print a multiplication table of 10 in reverse order. 
		
		     /*       int a = 10;
		            for(int i= 10; i>0; i--)
		            {
		            	System.out.println("multiplication of 10 reverse order="+ a +"*"+ i + "=" + a*i);
		            }
		       */     
	//Question 5: Write a program to find the factorial of a given number using for loops.	   
		                                      // What is factorial n = n * n-1 * n-2 ..... 1
	                              	          // 5! = 5*4*3*2*1 = 120
          /*        int number = 6;  
                  int i ,fact = 1;
                  for(i=1;i<=number;i++)
                  {
                	  fact = fact * i;
                  }
                  System.out.println("6!=" +fact);
            */
		
    //Question 6: Repeat problem 5 using a while loop.
		
            /*      int a = 5; // factorial of 5!
                  int i =1 ,fact =1 ;
                  while(i<=a)
                  {
                	  fact = fact*i;
                	  i++;
                  }
		          System.out.println("5!=" +fact);
		*/
		
     /*Question 7: Repeat problem 1 using for/while loop.	
	              *****	
		          ****
		          ***
		          **
		          *
		    */   // for loop 
		      /*    int a =5;
		          for(int i=a;i>0;i--)
		          {
		        	  for(int j=0;j<i;j++ )
		        	  {
		        		  System.out.print("*");
		        	  }
		        	  System.out.println( "\n" );
		          }
		       */
		          //while loop
		          
		          int i = 5;
		          while(i>0)
		          {
		        	   int j =0;
		        	     while(j<i)
		        	     {
		        		   j++;
		        		   System.out.print("*");
		        	     }
		        	   i--;
		               System.out.println();
		          }
		         
		
		
		
		
	//Question 8: What can be done using one type of loop can also be done using the other two types of loops - True or False.	
		         // ans - true. because we are using for , while loop same program, and it run.  
	
	
   //Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
		          
		        /*  int num = 8;
		          int sum = 0;
		          for(int i =1;i<=10;i++)
		          {
		        	   sum = sum + (num*i); 
		          }
		          System.out.println(sum);
		        */
		
	 /*Question 10 :A do-while loop is executed:
		        At least once
		        At least twice
		        At most once	          
		     ans :- at least once  */    
		
    //Question 11: Write a program to sum first n even numbers using a for loop.
		      
		   /*      int n = 5 ; // first 5 even number - 2,4,6,8,10 
		         int sum = 0; 
	             for(int i=0;i<=n;i++)
	             {
	            	 int evennumber = 2*i;   
	            	 sum = sum + evennumber; // 2+4+6+8+10 = 30
	             }
	            System.out.println(sum);
	            */
	}  
}
