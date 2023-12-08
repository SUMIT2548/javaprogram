package Mypackage;

public class MethodsExamples 
{
	public static void printjava()  // create method and choose any name in method/function 
	{
		System.out.println("Hello!Welcome");
	}
    public static void printname(String Name) // create method and choose any name in method/function 
    {
    	System.out.println(Name);
    }
    public static void printsum(int a, int b) // create method and choose any name in method/function 
    {
    	int sum = a+b;
    	System.out.println(sum);
    }
    
	public static void main(String[] args)
	{
		// method
	   printjava();	
	   printjava();
       printname("sumit saha");
       printsum(5,6);
	}

}
