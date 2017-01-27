import java.util.Scanner;
public class UserClassDriver
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String fN= user_input.nextLine();
		System.out.println("Please enter your last name");
		String lN = user_input.nextLine();
		System.out.println("Would you like to have an avatar [y or n] ");
		String choice = user_input.nextLine();
		if (choice.equals("n"))
		{
			UserClass user1 = new UserClass(fN,lN);
			System.out.println(user1);
		}
		else 
		{
			System.out.println("Please enter a avatar");
			String av = user_input.nextLine();
			UserClass user1 = new UserClass(fN,lN,av);
			System.out.println(user1);
		}
		
	}

}