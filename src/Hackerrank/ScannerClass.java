/*Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!
*/

/*Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/

package Hackerrank;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter the number");
        System.out.println("enter the double number");
        System.out.println("enter the String");
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
       
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
