package Mypackage;

public class ConstantsExample {

	public static void main(String[] args)
	{
		// constants - using final keyword. final variable always defined capital word.
		
		final Double GST = 12.50;
		
		int price = 100;
		Double finalprice = price + GST ;
		int price1 = 158;
		Double finalprice1 = price1 + GST ;
		
		System.out.println(finalprice);
		System.out.println(finalprice1);
	}

}
