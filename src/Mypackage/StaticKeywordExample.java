/* Static Variable and method example (Suppose there are 500 students in my college, now all instance data members will get memory 
each time when the object is created. All students have its unique roll no and name, so instance 
data member is good in such case. Here, "college" refers to the common property of all objects. If we make it 
static, this field will get the memory only once.)*/

package Mypackage;
class Collage 
{
	String Name;  //instance variable  
	int Roll;    //instance variable 
	static String Depertment = "CSE"; //static variable  
	static String CollageName = "NIT"; //static variable
	
	static void changed()  //static method-(A static method can access static data member and can change the value of it.) to change the value of static variable  
	{
		CollageName = "AOT";
	}
	
	public void Info()
	{
		System.out.println(Name+" "+Roll+" "+ Depertment+" "+CollageName);
	}

    Collage(String Name, int Roll) // Parameterize constructor  
    {
	 this.Name = Name;
	 this.Roll = Roll;
    }	
}

public class StaticKeywordExample
{
	public static void main(String[] args) 
	{
		Collage.changed(); //calling change method  
		Collage c1 = new Collage("Sumit",17);
		Collage c2 = new Collage("Suman",7);
		Collage c3 = new Collage("Supratim",27);
		c1.Info();
		c2.Info();
		c3.Info();
	}

}
