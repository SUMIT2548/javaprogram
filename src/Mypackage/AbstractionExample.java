package Mypackage;
// abstraction 
abstract class Animal
{
    abstract public void walk(); // abstract method 
    public void eat()            // non abstract method
    {
       System.out.println("Fruits");
    }
}
class Hourse extends Animal
{
	public void walk()
	{
		System.out.println("the animal walks in 4legs");
	}
}
class dog extends Animal 
{
	public void walk()
	{
		System.out.println("the animal walks in 4legs");
	}
}

public class AbstractionExample
{
	public static void main(String[] args) 
	{
		Hourse h1 = new Hourse();
		h1.walk();
		h1.eat();
		dog d1 = new dog();
		d1.walk();
		d1.eat();
	}

}
