import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter your hair color");
		String hair= user_input.nextLine();
		System.out.println("Please enter your eye color");
		String eyes = user_input.nextLine();
		System.out.println("Please enter your skin color");
		String skin = user_input.nextLine();
		
		Human object = new Human(hair,eyes,skin);
		
		System.out.println("My info......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		System.out.println("Please enter your friends hair color");
		hair= user_input.nextLine();
		System.out.println("Please enter your friends eye color");
		eyes = user_input.nextLine();
		System.out.println("Please enter your friends skin color");
		skin = user_input.nextLine();
		object.setHES(hair,eyes,skin);
			
		System.out.println("Your friends info......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
	}

}