//Hierarchical inheritance
package Mypackage;
class Shape2
{
	public void area()
	{
		System.out.println("Display the area");
	}
}
class triangle2 extends  Shape2
{
	public void area(int b , int h)
	{
		int a = b*h*1/2;
		System.out.println(a);
	}
}
class circle extends Shape2
{
	public void area(int i)
	{
	   double c = (3.14)*i*i;
	   System.out.println(c);
	}
}
public class InheritanceExample3
{
	public static void main(String[] args)
	{
		triangle2 t1 = new triangle2();
		t1.area(10, 4);
		
		circle c1 = new circle();
		c1.area(4);
	}

}
