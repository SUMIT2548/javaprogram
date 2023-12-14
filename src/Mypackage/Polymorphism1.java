// Compile time Polymorphism 
 // method overloading
// Java program for Method Overloading
// by Using Different Numbers of Arguments

package Mypackage;
 class Student3
{
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
      
      a1.profileinfo("Sumit");                 
      a1.profileinfo("Susmita", 10, 20);        
	}

}
