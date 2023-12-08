package Mypackage;

public class OperatorsExample {

	public static void main(String[] args) {
//a.Arithmetic Operators
//‘+’ Add		
		int a =52;
		int b = 45;
		int add = a+b;
		System.out.println(add);
//‘-’ Subtract		
		int a1 = 45;
		float b1 = 69.25f;
		float subtrct = a1-b1;
		System.out.println(subtrct);
//‘*’ Multiply	
		int a2 = 50;
		int b2 = 80;
		int multiply = a2 * b2;
		System.out.println(multiply);
//‘/’ Divide		
		int a3 = 60;
		int b3 = 40;
		int div = a3 /b3 ;
		System.out.println(div);	
//‘%’ Modulo - Remainder of a/b		
		int a4 = 60;
		int b4 = 40;
		int mod = a4%b4;
		System.out.println(mod);
// Unary 
		int c = 6;
	  
		System.out.println(c++);
		System.out.println(c);
		System.out.println(++c);
		
//b.logical operator 
// '&& or AND' 
		int A = 30;
		int B= 40;
		 if(A<50 && B<50)
			 System.out.println("both less then 50");
		 else 
			 System.out.println("both not less then 50");
		 
// '|| or OR'
		 int C = 7;
		 int D = 60;
		 if(C<50 || D<50)
			 System.out.println("any one less then 50");
		 else 
			 System.out.println("both not less then 50");		
// '! or NOT' 
		 int E = 10;
		 int F = 10;
		 if(E != F)
			 System.out.println("True");
		 else 
			 System.out.println("False");
		
		
		
	}
}
