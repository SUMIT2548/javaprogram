package Mypackage;

public class String1 
{
	public static void main(String[] args)
	{
	// Some function	
	// Concatenation	 
	String name1 = "Sumit";
	String name2 = "Saha";
  //String name = name1 + " " + name2; 
  //String name = name1 + name2;
	String name = name1 + "kumar" + name2;
	 
	System.out.println (name);

	//CharAt
	
	String myname ="sumitsaha";
	System.out.println(myname.charAt(4));
	
	//Length
	 System.out.println(myname.length());
	 
	 //Replace
	 String friend = " suman";
	 String friend1 = friend.replace('u','a'); // oldchar - u , new char - a
	 System.out.println(friend); // in java string is immutable, thats why Once a string is created it’s value cannot be changed  
	 System.out.println(friend1); // new string with a new value has to be created.( new string - friend1)
 
	 //substrings 
	 String myname1 = "Sumit Kumar saha";
	 System.out.println(myname1.substring(5, 11));
			 
	}

}
