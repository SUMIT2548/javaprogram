//multilevel inheritance 
package Mypackage;
class shape1
{
	public void area()
	{
		System.out.println("Display Area");
	}
}
class triangle1 extends shape1
{
	public void area(int b ,int h)
	{
		int a = b*h*1/2;
		System.out.println(a);
	}
}
class equilateraltriangle extends triangle1
{
	public void area(int b ,int h)
	{
		int a = b*h*1/2;
		System.out.println(a);
	}
}
public class InheritanceExample2 
{
	public static void main(String[] args) 
	{
		equilateraltriangle e1 = new equilateraltriangle();
		e1.area(4, 8);
	}

}
