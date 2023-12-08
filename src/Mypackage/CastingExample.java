package Mypackage;

public class CastingExample {

	public static void main(String[] args)
	{
		// Casting- Casting in java is the assigning values of one type to another.
		//Implicit casting -This casting is done by java implicitly i.e. on its own. It is assigning smaller values to larger data types.

		int price = 100;
		double gst = 18.5;
		double finalprice = price + gst;
		
		System.out.println(finalprice);

		//Explicit Casting -This casting is done by the programmer. It is assigning larger values to smaller data types.
          
		float price1 = 110.58F;
		int gst1 = 18;
		int fp = (int)price1 + gst1 ;
		
		System.out.println(fp);
	}
}