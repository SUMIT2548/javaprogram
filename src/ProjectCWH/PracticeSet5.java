package ProjectCWH;

public class PracticeSet5 {

	public static void main(String[] args) 
	{
//Create an array of 5 floats and calculate their sum.
	/*	float sum = 0;
	    float[] marks = {56.2f, 85.4f,75.4f,60.8f,68.5f};
	  
	    for(int i =0; i<marks.length;i++)
	    {
	    	sum = sum +marks[i];
	    }
	    System.out.println("Sum of 5 float Number:" +sum);
	 */ 
		
 //Write a program to find out whether a given integer is present in an array or not.
	/*   double[] number = {85.5, 45.6,85,78.6,80};
	    int num = 85;
	    boolean isArray = false;
	    for(double element : number)
	    {
	    	if(element == num)
	    	{
	    		System.out.println(element);
	    		isArray = true;
	    		break;
	    	}
	    }
	    if(isArray)
    	{
    		System.out.println("Yes!the value is present in the array");
    	}
    	else 
    	{
    		System.out.println("the value is present in the array");
    	}
	 */ 
		
//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.	 
    int[] PhysicsMarks = {85,75,65,95,45,78,73};
        float avg ;
        float sum1 = 0 ;
        for(float element : PhysicsMarks)
        {
        	 sum1 = sum1 + element;
        }
        avg = sum1/PhysicsMarks.length  ;
        System.out.println("average marks in physics of all student: "  +avg);  
	
		

		
	}

}
