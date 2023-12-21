package ProjectCWH;

public class PracticeSet2 {

	public static void main(String[] args) 
	{
		//Write a Java program to convert a string to lowercase.
		
		String Name = "Hi,Sumit Kumar Saha";
		Name = Name.toLowerCase();
		System.out.println(Name);
		
		//Write a Java program to replace spaces with underscores.
		
		String Collage  = "Narula Institute Of Technology";
		Collage = Collage.replace(" ", "_"); //String.replace(CharSequence target, CharSequence replacement)
		System.out.println(Collage);
		
		//Write a Java program to fill in a letter template which looks like below:
		// letter = “Dear <|name|>, Thanks a lot”
		// Replace <|name|> with a string (some name)
		
		String Letter = "Dear <|name|>, Thanks a lot";
		Letter = Letter.replace("<|name|>", "Sumit");
		System.out.println(Letter);
		
		//Write a Java program to detect double and triple spaces in a string.
		
		String Name2 = "Sumit  Kumar   Saha";
		System.out.println( Name2.indexOf("  "));
		System.out.println(Name2.indexOf("   "));
		
		//Write a program to format the following letter using escape sequence characters.
	     //	Letter = “Dear Harry, This Java Course is nice. Thanks”
		
		String Letter2 = "Dear Harry,\n\tThis Java Course is Nice.\n\tThanks!";
		System.out.println(Letter2);
	}
}
