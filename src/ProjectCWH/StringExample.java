package ProjectCWH;

public class StringExample {

	public static void main(String[] args)
	{
		String Name = "Sumit";
		
		//length()	Returns the length of String name
		System.out.println(Name.length());
		//toLowerCase()	Converts all the characters of the string to the lower case letters.
		System.out.println(Name.toLowerCase());
		// toUpperCase()	Converts all the characters of the string to the upper case letters.
		System.out.println(Name.toUpperCase());
		
		
		String Name1 = "    Sumit Kumar Saha    ";
		
		// trim()	Returns a new String after removing all the leading and trailing spaces from the original string.
		System.out.println(Name1);
		System.out.println(Name1.trim());
		
		
		String Name2 = "Code with Harry";
		
		//substring(int start)	Returns a substring from start to the end
		System.out.println(Name2.substring(2)); 
		//substring(int start, int end) Returns a substring from the start index to the end index. 
		//The start index is included, and the end is excluded.
		System.out.println(Name2.substring(3, 10));
		//replace(‘r’, ‘p’)	  Returns a new string after replacing r with p.
		System.out.println(Name2.replace('r', 'p'));
		//startsWith(“Co”)	Returns true if the name starts with the string “Co”.
		System.out.println(Name2.startsWith("Co"));
		//endsWith(“ry”)	Returns true if the name ends with the string “ry”. (True in this case)
		System.out.println(Name2.endsWith("ry"));
		
		
	/*	String a = "MphasisLtdLtd";
		
		// charAt(2)	Returns the character at a given index position
		System.out.println(a.charAt(4));
		// indexOf(“ ”)  Returns the index of the first occurrence of the specified character in the given string.
		System.out.println(a.indexOf("s"));      //indexOf(String str)
		System.out.println(a.indexOf("Ltd",6));  //indexOf(String str, int fromIndex)
		System.out.println(a.indexOf("Ltd",8));
		//lastIndexOf(“s”)	Returns the last index of the specified character from the given string. 
		System.out.println(a.lastIndexOf("s"));
		System.out.println(a.lastIndexOf("L", 9)); //lastindexOf(String str, int fromIndex)
		//equals(“Harry”)	Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
		System.out.println(a.equals("MphasisLtdLtd"));
		//equalsIgnoreCase   not case sensitive
		System.out.println(a.equalsIgnoreCase("mphasisltdltd"));   
	*/
	}

}
