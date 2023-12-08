package Mypackage;

import java.util.Scanner;

public class ConditonalStatement3 {

	public static void main(String[] args) 
	{
		// Switch statement using calculator
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Two Numbers");
     int A = sc.nextInt();
     int B = sc.nextInt();
     
     System.out.println("Choose the option"); // 1- sum , 2- sub , 3- multi , 4- divi, 5- mod
     int option = sc.nextInt();
     
     switch (option)
     {
    	 case 1 :
    		 System.out.println(A+B);
    		 break;
    		 
    	 case 2 :
    		 System.out.println(A-B);
    		 break;
    		 
    	 case 3 :
    		 System.out.println(A*B);
    		 break;
    		 
    	 case 4 :
    		 System.out.println(A/B);
    		 break;
    		 
    	 default :
    		 System.out.println(A%B);
    		 break;	 
     }
	}
}
