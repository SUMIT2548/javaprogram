package ProjectCWH;

public class ArrayExample {

	public static void main(String[] args) 
	{
		int[] Marks = {85,80,75,76,81};
	    // Displaying the Array (Naive way)
		System.out.println(Marks[0]);
		System.out.println(Marks[1]);
		System.out.println(Marks[2]);
		System.out.println(Marks[3]);
		System.out.println(Marks[4]);
		System.out.println("Length-" +Marks.length);
		
		// another Way - for loop
		String[] Names = {"Sumit","supratim","Susmita","Suman","Sumita"};
		for(int i=0;i<Names.length;i++)
		{
			System.out.println(Names[i]);
		}
		
		// Quick Quiz: Displaying the Array in Reverse order (for loop)
		int[] Numbers = {50,45,75,80,45,78};
		for(int i=Numbers.length-1; i>=0;i--)
		{
			System.out.println(Numbers[i]);
		}
		
		 // Quick Quiz: Displaying the Array (for-each loop)
		
		int[] Marks1 = {75,45,85,64,86,74};
		System.out.print("Printing using for-each loop \n");
		
		for(int element:Marks1)
		{
			System.out.println(element);
		}
	}
}
