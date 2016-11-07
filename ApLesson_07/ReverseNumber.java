import java.util.Scanner;
public class ReverseNumber
{	

	static int number;
	static int rev=0;


	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
		System.out.println("What is your number?");
		number = user_input.nextInt();
		getReverse();
		System.out.println(number + " reversed is " + rev);

			
	}	

	
	public static void getReverse()
	{
		int num = number;
		while (num > 0)
		{
			rev = rev*10;
			rev = rev + (num%10);
			num /= 10;
		}
	}		
}