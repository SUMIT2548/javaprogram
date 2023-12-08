package Mypackage;

class Employee
{
	String Name;
	int age;
	int salary;
	
	public void printinfo() // method 
	{
		System.out.println(this.Name);	
		System.out.println(this.age);
		System.out.println(this.salary);
	}
	 Employee(String Name, int age, int salary) // parameter constructor
	 {
		 this.Name = Name;
		 this.age = age;
		 this.salary = salary;
	 }
	 Employee(Employee s1) // copy Constructor
	 {
		this.Name = s1.Name;
		this.age = s1.age;
		this.salary = s1.salary;
	 }
}

public class ConstructorExample4 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Sumit",35,70000); // object parameter constructor
		//e1.printinfo();
		Employee s1 = new Employee(e1); // object Copy constructor
		s1.printinfo();	
	}

}
