import java.util.Scanner;
public class Digitadder
{	

	static int number;
	static int sum=0;

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
		System.out.println("What is your number?");
		number = user_input.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);

			
	}	

	
	public static void sumDigits()
	{
		int num = number;
		while (num > 0)
		{
			sum = sum + (num%10);
			num /= 10;
		}
	}		
}