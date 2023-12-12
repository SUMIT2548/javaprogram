package Mypackage;

interface Animal1
{
	 final int a = 2;
	 void walk();
}

 class Hourse1 implements  Animal1
{
	public void walk()
	{
		System.out.println("This animal walks in 4legs");
		System.out.println("eyes = "  + a);
	}
}
 class Dog1 implements Animal1
 {
	 public void walk()
	 {
		 System.out.println("The animal walks in 4legs");
		 System.out.println("eyes = "  + a);
	 }
 }

public class AbstractionInterfaceExample 
{
	public static void main(String[] args) 
	{
		Hourse1 h1 = new Hourse1();
			h1.walk();
		Dog1 d1 = new Dog1();
		d1.walk();
	}
}
