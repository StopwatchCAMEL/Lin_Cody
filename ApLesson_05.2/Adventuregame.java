import java.util.Scanner;
public class Adventuregame
{	
	public static void main(String[]args)
	{	
		int choice;
		
		Scanner user_input = new Scanner(System.in);	
		System.out.println("Welcome the best adventure game of all time!!!!");
		System.out.println("You are the prince of Norway on a adventure");
		System.out.println("You wake up one day on your bed in Canada");
		System.out.println("What do you do");
		System.out.println("[1] Keep Sleeping");
		System.out.println("[2] Get out of bed");
		System.out.println("[3] Go outside");
		choice=user_input.nextInt();
			if (choice == 1)
			{	
				System.out.println("You sleep for another 2 days");
				System.out.println("A messenger enters your room and calls your name");
				System.out.println("Do you....");
				System.out.println("[1] Keep sleeping");
				System.out.println("[2] Get up and see what the messenger wants");
				choice=user_input.nextInt();
			    if (choice ==1)
				{	
					System.out.println("You continue to sleep");
					System.out.println("Your slumber continues for years as your body slowly forms into a rock");
					System.out.println("You have become a rock");
					System.out.println("That means you're dead, stop playing");
				}
				else if (choice ==2)
				{
					System.out.println("You get up and see that the messenger has a knife");
					System.out.println("Do you.....");
					System.out.println("[1] Fight for your life");
					System.out.println("[2] Jump out of the window");
					choice=user_input.nextInt();
					if (choice == 1)
					{
						System.out.println("You get your sword and engage in combat with the assassin");
						System.out.println("However you remember that you do not know how to fight with a sword as the assassin cuts you down");
						System.out.println("Maybe you shouldn't sleep next time");
					}
					else if (choice == 2)
					{	
						System.out.println("You make your escape out of the window.....");
						System.out.println("And fall 100ft out of the tower that you were sleeping in");
						System.out.println("Shouldve brought a parachute");
					}
				}
				
			}	
			else if (choice == 2)
			{	
				System.out.println("You rise from your bed");
				System.out.println("There is a potato on the table");
				System.out.println("Do you......");
				System.out.println("[1] Eat the potato");
				System.out.println("[2] Get dressed and walk outside");
				choice = user_input.nextInt();
				if (choice ==1)
				{
					System.out.println("The potato seems to be poisoned");
					System.out.println("You died a terrible and pathetic death");
				}
				else if (choice ==2)
				{
					System.out.println("You emerged from your castle dressed and ready to govern your people");
					System.out.println("However in the distance you see the fast approaching penguin army of the north");
					System.out.println("Do you..........");
					System.out.println("[1] Prepare for war");
					System.out.println("[2] Flee like the coward you are");
					choice=user_input.nextInt();
					if (choice==1)
					{
						System.out.println("You quickly call for your men to mobilize against the approaching penguin threat");
						System.out.println("You fight valiantly, but are soon overwhelmed by the war machine that is the penguin army");
						System.out.println("Your people will remember you as a hero");
					}
					else if(choice==2)
					{
						System.out.println("As you attempt to flee from the approaching invaders a stray arrow hits you in the knee");
						System.out.println("You slowly bleed out as the penguin army sets fire to your once beautiful kingdom");
					}
				}
			}
			else if (choice == 3)
			{
				System.out.println("You walk outside and get killed by a falling anvil");
				System.out.println("Sucks to suck");
			}
			else
			{
				System.out.println("You died in your sleep because you did not enter a valid choice");
			}

	}	
}
