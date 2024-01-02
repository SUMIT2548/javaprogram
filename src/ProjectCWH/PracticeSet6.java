package ProjectCWH;

public class PracticeSet6 {

	public static void main(String[] args) 
	{
// Create a Java program to add two matrices of size 2x3.
		int [][] num1 = {{2,2,2},{3,3,3}};
		int [][] num2 = {{1,1,1},{4,4,4}};
		int [][] result = {{0,0,0},{0,0,0}};
		
		for(int i= 0;i<num1.length;i++)
		{
        	for(int j= 0;j<num1[i].length;j++)
			{
			System.out.format(" Setting value for i=%d and j=%d\n", i ,j);
			result[i][j] = num1[i][j] + num2[i][j]; 
			}
		}
		for(int i=0; i<num1.length; i++)
		{
			for(int j=0; j<num1[i].length;j++)
			{
				System.out.print(result[i][j] +" ");
				result[i][j] = num1[i][j] +num2[i][j];
			}
			System.out.println(" ");
		}
// Write a Java program to reverse an array.
		
		int[] num = {45,50,55,60,75,85};
		for(int i = num.length-1; i>=0; i--)
		{
			
			System.out.print(num[i]+ " ");
		}
		
		
		
		
	}

}
