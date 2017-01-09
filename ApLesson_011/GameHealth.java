import java.util.Scanner;
import java.util.Random;

public class GameHealth
{	
	static int healthCount;
	static int HEALTHLOAD = 6; 
	static String [] health; 
	
	public static void main(String[]args)
	{
	Scanner user_input = new Scanner(System.in);
	Random rand= new Random();
	String turn= "";
	int damage = 0;
	int amount = 0;
	healthCount=6;
	health=new String[HEALTHLOAD];
	
		while (!turn.equals("Q") && healthCount>0)
		{
		System.out.println("Your turn! Hit e when ready: ");
		turn = user_input.next();
		damage = rand.nextInt(2)+1;
		amount = rand.nextInt(6)+1;
		System.out.println(takeDamage(damage,amount));
		printClip();
		}
		System.out.println("You died");
	}	
	public static String takeDamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthCount= healthCount-amt;
			return ("Taking " + amt + " damage");
		}
		else 
		{
			if (healthCount+amt< HEALTHLOAD)
				healthCount= healthCount + amt;
			else 
				healthCount= HEALTHLOAD;
		}
		return("Power Up " + amt);
	}
	
	public static void printClip()
	{
		String output = "Health";
		for (int i = 0; i < HEALTHLOAD; i++)
		{
			if (i< healthCount)
				health[i]="@";
			else
			{
				health[i]="[]";
			}
			output=output+health[i];
		}
		System.out.println(output);
	}

}