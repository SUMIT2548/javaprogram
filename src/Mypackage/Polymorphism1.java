// Compile time Polymorphism 
 // method overloading

package Mypackage;
 class Student3
{
	String Name;
	int Roll;
	long age;
	
	public void profileinfo(String Name)
	{
		System.out.println(Name);
	}
	public void profileinfo(int Roll)
	{
	   System.out.println(Roll);	
	}
	public void profileinfo(long age)
	{
		System.out.println(age);
	}
	public void profileinfo(String Name,int Roll,long age)
	{
		System.out.println(Name+" "+Roll+" "+age);
	}
}
public class Polymorphism1 {

	public static void main(String[] args)
	{
      Student3 a1 = new Student3();
      a1.Name = "Sumit";
      a1.Roll = 25;
      a1.age = 20;
      
      a1.profileinfo(a1.Name);                  // type1 for o/p
      a1.profileinfo("Susmita", 10, 20);        // type2 for o/p
	}

}
