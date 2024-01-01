package ProjectCWH;

public class ArrayTwoD {

	public static void main(String[] args)
	{
		// 2-D Array
		
		int[][] Marks = new int[2][3];
		// type1
		Marks[0][0] = 70 ;
		Marks[0][1] = 85;
		Marks[0][2] = 78;
		Marks[1][0] = 45;
		Marks[1][1] = 86;
		Marks[1][2] = 90;
	//	System.out.println(Marks[0][2]);
		
		// 2D array with for loop 
		
				for(int i=0;i<Marks.length;i++)  
				{
					for(int j=0;j<Marks[i].length;j++)
					{
						System.out.print(Marks[i][j]);
						System.out.print(" ");
					}
					System.out.println("");
				}
				
				
		//type2		
		int[][] marks = {{85,95,75},{78,56,65}};
	//	System.out.println(marks[0][1]);
		
		// 2D array with for loop 
		for(int i=0; i<marks.length;i++)
		{
			for(int j=0; j<marks[i].length;j++)
			{
				System.out.print(marks[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}    
	}

}
