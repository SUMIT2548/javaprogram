package Mypackage;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args)
	{  
		// 1D array 
//type-1 
		int[] results = {80,65,85,50};
// type-2 
	   // int[] results = new int[4];
	 
	   //	boolean[] results = new boolean[4];
	  
	   // results[0] = 85;
	   // results[1] = 90;
	   //  results[2] = 92;
	   // results[3] = 82;
	   
	 //  System.out.println(results[2]);
		
		//length
	 //   System.out.println(results.length);
	    
	  //before sort 
	    System.out.println(results[0]);

	    // after sort 
	    Arrays.sort(results);
        System.out.println(results[0]);
       
		
		
		//2D Array 
		
		int[][] Marks = {{90,58,60,85},{85,75,89,95}};	
        System.out.println(Marks[0][0]);
        System.out.println(Marks[1][0]);
	
	}

}
