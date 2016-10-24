import java.util.Scanner;
public class Factorial
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
			
				int num;
				int count;
				int factorial;
	
				System.out.println("Please enter your number:");
				num =user_input.nextInt();
				factorial=1;
				for (count=1; count<=num; count++)
				{
				factorial=factorial*count;
				System.out.print(factorial+" ");
				
				}

	}	
		
}