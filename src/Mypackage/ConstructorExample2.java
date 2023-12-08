package Mypackage;

class Car
{
   String carname;
   int    price;
   String type;
   
   public void printdetails()
   {
	   System.out.println(this.carname);
	   System.out.println(this.price);
	   System.out.println(this.type);
   }
    Car (String carname,int price, String type) // parameterized constructor
    {
    	this.carname = carname;
    	this.price = price;
    	this.type = type;
    }
}
public class ConstructorExample2 {

	public static void main(String[] args) 
	{
        Car c1 = new Car("Hero", 55000, "Bike");
          c1.printdetails();
	}

}
