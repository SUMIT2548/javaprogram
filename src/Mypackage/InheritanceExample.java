// Single inheritance

package Mypackage;
class Shape // parent class
{
	public void area()
	{
		System.out.println("Display area");	
	}
}
class triangle extends Shape // child class
{
	public void area(int base, int height)
	{
		int a = (base*height)*1/2 ;
		System.out.println(a);
	}
}

public class InheritanceExample {

	public static void main(String[] args)
	{
       triangle t1 = new triangle();
       t1.area(8, 4);
	}

}
