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
	    System.out.println(results.length);
	    
	  //before sort 
	    System.out.println(results[0]);

	    // after sort 
	    Arrays.sort(results);
       System.out.println(results[0]);
        
        //For-each loop
        System.out.print("Printing The Array Program For-each \n ");
        for (int element:results)
        {
        	System.out.println(element);
        } 
        
       //for loop 
        for(int i=0;i<results.length;i++)
        {
        	System.out.println(results[i]);
        }
		
		
		//2D Array 
		
		int[][] Marks = {{90,58,60,85},{85,75,89,95}};	// int[2][4] means [0 0,0 1,0 2,0 3][1 0,1 1,1 2,1 3]
    //    System.out.println(Marks[0][0]);
    //   System.out.println(Marks[1][0]);
		
		// for loop with 2d array
		for( int i = 0; i <Marks.length; i++)  // int[i][j] = int[2][4]
		{
			for(int j = 0; j< Marks[i].length; j++)
			{
				System.out.print(Marks[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
    	
	}

}
