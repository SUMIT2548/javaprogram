//Example Using- method , constructor, Static , AccessModifiers  

package Mypackage;
class Mphasis
{
	public String EmployeeName; 
	protected int EmpID;
	static String Manager = "Sumedh" ;  // Static variable
	static String Location = "Pune" ;   // Static variable 
	private int Salary;
	
	static void change()  // Static method to call change the static value
	{
		Location = "Bangalore";
	}
    
	public void info() // method
	{
		System.out.println(EmployeeName+ " "+EmpID+ " " +Manager+ " " + Location+" "+ Salary );
	}
	Mphasis(String Name, int Id, int Salary ) // parameterized Constructor
	{
		this.EmployeeName = Name;
		this.EmpID = Id;
		this.Salary = Salary;
	}
	Mphasis(Mphasis s2)  // copy Constructor
	{
		this.EmployeeName = s2.EmployeeName;
		this.EmpID = s2.EmpID;
		this.Salary = s2.Salary;
	}

}
public class Example {

	public static void main(String[] args) 
	{
		Mphasis.change(); // calling change method 
        Mphasis m1 = new Mphasis("Sumit",2498,45000 ); // object 
        m1.info();
        Mphasis m2 = new Mphasis("Shiva",2499,40000);
        m2.info();  
        Mphasis s2 = new Mphasis(m1); // copy constructor object
        s2.info();
	}

}
