// Java Encapsulation
package Mypackage;
//Person Class
class Student4 
{
	private String Name;                  // Encapsulating the name and age
                                         // only approachable and used using
                                         // methods defined
	private int age;
	
	public String getName()
	{
		return this.Name ;
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public int getage()
	{
		return this.age ;
	}
	public void setage(int age)
	{
		this.age = age;
	}
	
}
//Driver Class
public class Encapsulation {

	public static void main(String[] args) 
	{
		Student4 s1 = new Student4();
		s1.setName("Sumit");
		s1.setage(24);
		System.out.println(s1.getName());
		System.out.println(s1.getage());

	}

}
