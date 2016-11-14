import java.util.Scanner ;
public class LuckySevens
{
	static int number;
	
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter your number");
		number = user_input.nextInt();
		System.out.println(Luck(number));
	
	}
	
	public static int Luck(int num)
	{
		if (num > 0)
		{
			if (num%10 == 7)
			{
				return 1+ Luck(num/10);
			}
			else
			{
				return 0+ Luck(num/10);
			}
		}
		else
		{
			return 0;
		}
	}	
}