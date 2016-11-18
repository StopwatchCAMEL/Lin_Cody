import java.util.Scanner;
import java.util.Random;

public class GetOdds
{

	static Random rand= new Random();
	static int [] num = new int[10];
	
	public static void main(String[]args)
	{
		
		System.out.println("For the following numbers.....");
		fillArray();
		System.out.println("These are the odd numbers....");
		System.out.println(getOdds());
			
	}
	public static void fillArray()
	{
		for (int i = 0; i < num.length; i++)
		{
			num[i]=rand.nextInt(100)+1;
		}
		for (int numbers : num) 
		{
			System.out.print(numbers + " ");
		}	
		System.out.println("\n");
	}	
	public static String getOdds()
	{
		String odds="";
		for (int odd : num)
		{
			if (odd % 2 != 0)
			{	
			odds += odd + " ";
			}
		}
		return odds;
	}	
}