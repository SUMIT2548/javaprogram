// Create a simple Rock, Paper Scissors game in Java.
// 0 Rock 1 paper 2 Scissor
// user input and computer choose
package ProjectCWH;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose any one - 1Rock,1Paper,2Scissor");
		System.out.println();
		int UserChoose = sc.nextInt();
		
		// creating an object 
		Random random = new Random(); 
		// Generates random integers 0 to 3
		int ComputerChoose = random.nextInt(3);
		
		// Game Condition
		if(UserChoose == ComputerChoose)
		{
			System.out.println("Game Draw");
		}
		else if( UserChoose ==0 && ComputerChoose == 2 || UserChoose ==1 && ComputerChoose ==0 || 
				                                                               UserChoose ==2 && ComputerChoose == 1)
		{
			System.out.println("You! Win This Game");
		}
		else 
		{
			System.out.println("Computer! win ");
		}
		 
		// Computer choose o/p
		if(ComputerChoose == 0)
		{
			System.out.println("ComputerChoose: Rock");
		}
		else if(ComputerChoose == 1)
		{
			System.out.println("ComputerChoose: Paper");
		}
		else if(ComputerChoose == 2)
		{
			System.out.println("ComputerChoose: Scissor");
		}
		
	}

}
