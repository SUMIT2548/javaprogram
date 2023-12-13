// Access Modifiers example - private
package Mypackage;
class Infosys
{
	public String Name;
	int ID;
	protected String Email;
	private long PhoneNumber;
	
	public void Info()
	{
		System.out.println(this.Name);
	    System.out.println(this.ID);
	    System.out.println(this.Email);
	}
	 public long getPhoneNumber()
	 {
		 return this.PhoneNumber;
	 }
	 public void setPhoneNumber(long number)
	 {
		 this.PhoneNumber = number;
	 }
}

public class Example1 
{
	public static void main(String[] args) 
	{
		Infosys i1 = new Infosys();
		i1.Name ="Sumit";
		i1.ID = 24987;
		i1.Email = "Sumit.saha@info.com";
		i1.Info();
		
		i1.setPhoneNumber(8989898989l);
		System.out.println(i1.getPhoneNumber());
	}
}
