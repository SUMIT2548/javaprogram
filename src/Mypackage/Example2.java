//Runtime Polymorphism in Java
//Java Program for Method Overriding
package Mypackage;
class Shape10
{
	public void area10()
	{
		System.out.println("Display Aera");
	}
}
class Rectangle extends Shape10
{
	public void area10()
	{
		System.out.println("rectangle area =");
	}
}
class Circle1 extends Shape10
{
	public void area10()
	{
		System.out.println("circle area = ");
	}
}

public class Example2 {

	public static void main(String[] args)
	{
	 Shape10 S1 = new Shape10();
	 S1= new Rectangle();
	 S1.area10();
	 S1=new Circle1();
	 S1.area10();
	}

}
