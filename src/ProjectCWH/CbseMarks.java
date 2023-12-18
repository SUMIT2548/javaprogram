/*Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be
taken as input from the keyboard. (Marks are out of 100).*/

package ProjectCWH;

import java.util.Scanner;

public class CbseMarks {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner (System.in);
        
        int TotalNumber = 500;
        
        System.out.println("Enter Your Name");
        String StudentName = sc.nextLine();
        
        System.out.println("Marks of Mathematics");
        int Math = sc.nextInt();
        System.out.println("Marks of Biology");
        int Bio = sc.nextInt();
        System.out.println("Marks of Physics");
        int Phy = sc.nextInt();
        System.out.println("Marks of English");
        int Eng = sc.nextInt();
        System.out.println("Marks of Computer Science");
        int CS =  sc.nextInt();
        
        
        double TotalMarks = (Math+Bio+Phy+Eng+CS);
        System.out.println("Student totalmaks= "+TotalMarks +"out of" +TotalNumber);
        
        double Percentage = (TotalMarks*100)/TotalNumber ;  // serial of the operation -> + - * /
        System.out.println("Total percentage of his marks = " +Percentage + "% out of 100");

	}

}
