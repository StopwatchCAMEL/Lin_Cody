import java.util.Scanner;
public class Box
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			
				//info 
				System.out.println("Please enter your word:");
				String word=user_input.next();
				System.out.println();
				for (int count=1; count<=word.length(); count++)
				{
				System.out.println(word);
				
				}

	}	
		
}