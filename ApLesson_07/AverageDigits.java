import java.util.Scanner;
public class AverageDigits
{	

	static int number;
	static double average=0;
	static int digits=0;

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
		System.out.println("What is your number?");
		number = user_input.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);

			
	}	

	
	public static void avDigits()
	{
		int num = number;
		while (num > 0)
		{
			digits++;
			average = average + (num%10);
			num /= 10;
		}
		average=average/digits;
	}		
}