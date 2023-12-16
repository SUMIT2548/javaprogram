package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter the Number");
		int N = scanner.nextInt();
		
     //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	/*	\n is LF or Line Feed or NewLine
		\r is CR or Carriage Return 
		\r\n CR+LF is used in Windows as newLine sequence
		U+0085 NEL is the Unicode character for NExt Line
		U+2028 is the Unicode character for Line Separator
		U+2029 is the Unicode character for Paragraph Separator*/
		
        scanner.close();
       
        if(N % 2 != 0)
        {
            System.out.println("Weird");
        }
        else if (N%2==0 && N>2 && N<5)
        {
            System.out.println("Not Weird");
        }
        else if(N%2==0 && N>6 && N<20)
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
	}
	

}
