import java.util.Scanner;
public class Password
{	
	static String User;
	static String Pass;
	static String user1;
	static String pass1;
	static Scanner user_input;
	
	public static void main(String[]args)
	{
		user_input = new Scanner(System.in);	
		
			
				//info 
				System.out.println("Please enter a username");
				User=user_input.next();
				System.out.println("Please enter a password");
				Pass=user_input.next();
				passCheck();
	}	
	//method
	public static void passCheck()
	{
		System.out.println("What is your username?");
		user1=user_input.next();
		System.out.println("What is your password?");
		pass1=user_input.next();
		if (user1.equals(User) && pass1.equals(Pass))
		{
			System.out.println("You are granted access");
		}
		else
		{
			if (user1.equals(User) && pass1!=Pass)
			{
				System.out.println("Your password is incorrect");
				passCheck();
			}	
			else if (user1!=User && pass1.equals(Pass))
			{
				System.out.println("Your username is incorrect");
				passCheck();
			}
			else 
			{
				System.out.println("Your password and username is incorrect");
				passCheck();
			}
		}
	}
	
}