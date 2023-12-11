package Mypackage;
//Access Modifiers - public,Private, Protect, Default

class Bank
{
	public String Name;
	int Age;
	protected String email;
	private String Password;
	
	public void info()
	{
		System.out.println(this.Name);
		System.out.println(this.Age);
		System.out.println(this.email);
	}
	
	public String getPassword()
	{
		return this.Password;
	}
	
	public void setPassword(String Pass)
	{
		this.Password = Pass;
	}
}

public class AccessModifiersExample 
{
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		b1.Name = "Sumit";
		b1.Age = 30;
		b1.email = "Sumit.saha@email.com";
		b1.info();
		b1.setPassword("Su12");
		System.out.println(b1.getPassword());
	}
}