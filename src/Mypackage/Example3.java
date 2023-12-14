// Multiple Inheritance

package Mypackage;
interface Preants
{
	void family();
}
interface Kids
{
	void family1();
}
class House implements Preants, Kids
{
	public void family()
	{
		System.out.println("My son");
	}
	
	public void family1()
	{
		System.out.println("My Daughter");
	}
}

public class Example3 {

	public static void main(String[] args)
	{
		House h1 = new House();
		h1.family();
		h1.family1();
	}

}
