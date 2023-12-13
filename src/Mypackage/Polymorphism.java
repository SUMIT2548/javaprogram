//Runtime Polymorphism in Java
//Java Program for Method Overriding
package Mypackage;
class Fruits
{
	public void ab()
	{
		System.out.println("Fruits list");
	}
}
class Apple extends Fruits 
{
	public void ab()
	{
		System.out.println("Apple is testy");
	}
}
class Mango extends Fruits
{
   public void ab()
   {
	   System.out.println("Mango is best fruit");
   }
}

public class Polymorphism {

	public static void main(String[] args) 
	{
		//// Creating object of class 1
		Fruits f1 = new Fruits();
		// Now we will be calling ab methods
        // inside main() method
		f1 = new Mango();
		f1.ab();
		f1 = new Apple();
		f1.ab();
	}

}
