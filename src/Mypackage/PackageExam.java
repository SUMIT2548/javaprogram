package Mypackage;

//import package.name.Class;   // Import a single class
//import package.name.*;   // Import the whole package


import Package_Name.*;
import Package_one.Two;

public class PackageExam {

	public static void main(String[] args)
	{
		One o1 = new One();
		Two t1 = new Two();
		o1.main();
		t1.print();
	}

}
