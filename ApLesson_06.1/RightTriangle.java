import java.util.Scanner;
public class RightTriangle
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			
				//info 
				System.out.println("Please enter your word:");
				String word=user_input.next();
				for (int count=word.length(); count>=0; count--)
				{
				System.out.println(word.substring(count,word.length()));
				
				}

	}	
		
}