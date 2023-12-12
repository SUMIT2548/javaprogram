// Multiple Inheritance example1
package Mypackage;

interface A
{
	  default void printa()
	{
		System.out.println("My Name");
	}
}
interface B
{
	default void printb()
	{
		System.out.println("Sumit");
	}
}

class C implements A,B
{
	public void printc()
	{
		System.out.println("Saha");
	}
}

public class InheritanceExample4 {

	public static void main(String[] args) {
		C obj = new C();
		obj.printa();
		obj.printb();
		obj.printc();
	}
}
