import java.util.Scanner;
public class LeftTriangle
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			
				//info 
				System.out.println("Please enter your word:");
				String word=user_input.next();
				for (int count=0; count<=word.length(); count++)
				{
				System.out.println(word.substring(count,word.length()));
				
				}

	}	
		
}