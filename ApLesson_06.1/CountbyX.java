import java.util.Scanner;
public class CountbyX
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			int num;
			int countup;
			int count;
			
				//info 
				System.out.println("Please enter the number you want to go up to:");
				num=user_input.nextInt();
				System.out.println("Please enter the number you wish to count up by");
				countup=user_input.nextInt();
				for (count=0; count<=num; count+=countup)
				{
				System.out.println(count);
				
				}

	}	
		
}