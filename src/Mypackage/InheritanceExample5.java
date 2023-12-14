// multiple Inheritance example 2
package Mypackage;
 
interface Classa
{
	void print();
}
interface Classb
{
	void print();
}

class C1 implements Classa, Classb
{
	public void print()
	{
		System.out.println("Haii.. I am from classa");
	}
}

public class InheritanceExample5 {

	public static void main(String[] args)
	{
		C1 opt = new C1();
		opt.print();
	}

}
