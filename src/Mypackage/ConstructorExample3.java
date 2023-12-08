package Mypackage;

class Student1
{
	String name;
	int age;
	
    public void info()
     {
         System.out.println(this.name);
         System.out.println(this.age);
     }
    Student1(Student1 s2) // copy constructor
     {
	      this.name = s2.name;
	      this.age = s2.age;
     } 
    Student1() // Default constructor
    {	
    }
}
public class ConstructorExample3 
{
	public static void main(String[] args) 
	{
       Student1 s1 = new Student1();
       s1.name ="Sumit";
       s1.age = 25;
      
       Student1 s2 = new Student1(s1);
       s2.info();   
	}

}
