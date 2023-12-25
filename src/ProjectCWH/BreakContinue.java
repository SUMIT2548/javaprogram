package ProjectCWH;

public class BreakContinue {

	public static void main(String[] args) 
	{
		// do while using break , continue keyword //
        int i = 1;
		do 
		{
			System.out.println(i);
			i++;
			     if(i == 5)
			   {
				 System.out.println("Avoid this Step");
				 i++;
				 continue;
			   }
		         if(i == 10)
		       {
			     System.out.println("End The Loop");
			     break;
		       }
		}
		while(i <= 40);
      System.out.println("Loop ends here");
	
	 // using for loop //
      for(int a = 1; a <= 40; a++)
      {
    	if(a==20)
    	{  
    		System.out.println("avoid line");
    		continue;	
    	}
    	System.out.println(a);  
      }
	
	
	
	
	
	
	
	
	
	}
}
