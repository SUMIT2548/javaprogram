package Mypackage;

public class KeywordExample {

	public static void main(String[] args)
	{
	 int a = 0;
	 while(true) // infinite times
	 {
		 if(a == 8)
		 {
			a++; // a= a+1
			continue;
		 }
		 
	 
		 System.out.println(a);
		 a++;
		 if(a>20)
		 {
			 break;
		 }
	  }
     
	}

}
