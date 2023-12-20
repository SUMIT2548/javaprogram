package ProjectCWH;

public class AssociativityOperator {

	public static void main(String[] args) 
	{
	 // Precedence & Associativity
	//  Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity
		int a =   6*5-34/2;
		
		/*6*5-34/2
		 *30-34/2
		 =30-17
		 =13 */
		
		int b = 60/5-34*2;
		
		/* 60/5-34*2
		 * 12-34*2
		 * 12-68
		  = -56 */
		
		System.out.println(a);
		System.out.println(b);
		
		//Quick Quiz
		
		float x = 20 , y= 15;
		float z = x - y/ 2;        // 20-15/2 -> 20-7.5 -> 12.5
		System.out.println(z);
		
		
		float d = 4,e = 5,c = 6;
		float A = (e*e - 4*d*c) /( 2*d);    // (5*5-4*4*6)/(2*4) -> 25-96/8 ->-71/8 ->8.875
		System.out.println(A);

	}

}
