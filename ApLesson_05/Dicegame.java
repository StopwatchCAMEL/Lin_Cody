import java.util.Scanner;
import java.util.Random;
public class Dicegame
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		Random rand= new Random();
		
			//get info
			int roll1= rand.nextInt(6)+1;
			int roll2= rand.nextInt(6)+1;
			System.out.println("You rolled a " + roll1);
			System.out.println("The computer rolled a " + roll2);
			rolldice(roll1,roll2);
			
	}	
	//method
	public static void rolldice(int r, int r2)
	{
		if(r>r2)
			System.out.println("You're a winner");
		if(r<r2)
			System.out.println("You're a loser ");
		if(r==r2)
			System.out.println("You tied");
	}
		
}