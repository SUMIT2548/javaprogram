package Mypackage;

public class ExceptionHandlingExample {

	public static void main(String[] args) 
	   // Exception Handling try-catch
	{
		int[] Marks = {50,85,65};
		try 
		{
		   System.out.println(Marks[5]);
		}
		catch(Exception exaception)
		{ 
			// do something after catching
			System.out.println("An exception for caught while accessing an index the 'marks' array");
		}
		 System.out.println("My Name is Samir Das");
	}

}