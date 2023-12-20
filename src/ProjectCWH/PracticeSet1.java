package ProjectCWH;

import java.util.Scanner;

public class PracticeSet1 {

	public static void main(String[] args)
	{
		// 1.What will be the result of the following expression - float a = 7/4 * 9/2
		float a = 7/4*9/2;       // the number is int, thats why the o/p 7/4*9/2 -> 1*9/2 -> 9/2 -> 4 
		float b = 7/4f *9/2f;    // 7/4*9/2 -> 1.75*9/2 -> 15.75/2 ->7.875
		 System.out.println(a);	
		System.out.println(b);
		
		
		//2.Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
		//encrypt
		char grade = 'B';
		char newgrade = (char) (grade + 8);
		System.out.println(newgrade);
		//decrypt
		char oldgrade = (char)(newgrade - 8);
		System.out.println(oldgrade);
		

		//3.Find the value of 'A' in expression given below : int x = 7 -> int A = 7*49/7 + 35/7
		int x = 7;
		int A = 7*49/7 + 35/7; // 343/7+35/7 -> 49+35/7 -> 49+5-> 54   rule - lelt to right ( precedence / * - 12 , + - - 11)
		System.out.println(A);
		           
		
		//4.Write the following expression in a java program: (v^2-u^2)/2es
		float v = 5, u =10, e = 4, s = 12;
		float j = (v*v-u*u)/(2*e*s); // (5*5-10*10)/(2*4*12) -> 25-100/96 -> -75/96 -> -0.78125
		System.out.println(j);
		
		
		//5.Use comparison operators to find out whether a given number is greater than the user entered number or not.
		 Scanner sc = new Scanner(System.in);
		 int number = sc.nextInt();
		 boolean number1 = sc.hasNextInt(); // number int then print ture otherwise false
		 System.out.println(number>50);
		 System.out.println(number1);  
	}

}
