package Mypackage;

class Student
{
	String name;
	int roll;
	int age;
	int eng ;
	int math;

    public void info()  // create method
    {
    	System.out.println(this.name);
    	System.out.println(this.roll);
    	System.out.println(this.age);
    }
    public void marks() // method
    {
    	System.out.println(this.name);
    	System.out.println(this.eng);
    	System.out.println(this.math);
    }
}

public class ClassObject 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(); // object 
	     s1.name= "Sumit";
	     s1.roll = 5;
	     s1.age = 20;
	     s1.eng = 85;
	     s1.math = 96;
	    
	     s1.info();
	     s1.marks();
	    Student s2 = new Student(); // object
	   
	     s2.name= "Ankita";
	     s2.eng = 89;
	     s2.math = 90;
	    
	    
	     s2.marks();
	}   
}
