package Mypackage;

class product
{
	String ProductName;
	int Price;
 
	public void printprod() // create method
	{
		System.out.println(this.ProductName);
		System.out.println(this.Price);
	}

    product() // non parameter constructor
    {
	System.out.println("The Product is Expensive");
    }
}

public class ConstructorExample1 {

	public static void main(String[] args)
	{
		product s1 = new product();
		s1.ProductName="iphone";
		s1.Price=65000;
		
		s1.printprod();
	}

}
