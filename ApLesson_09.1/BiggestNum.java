import java.util.Scanner;
import java.util.Random;

public class BiggestNum
{

	static Random rand= new Random();
	static int [] num = new int[10];
	
	public static void main(String[]args)
	{
		
		System.out.println("For the following numbers.....");
		fillArray();
		System.out.println("The biggest number is.......");
		System.out.println(getBiggest());
			
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
	public static int getBiggest()
	{
		int max=0;
		for (int numbers : num)
		{
			if (numbers > max)
			{	
			max=numbers;
			}
		}
		return max;
	}	
}