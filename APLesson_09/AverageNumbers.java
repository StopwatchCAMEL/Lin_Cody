import java.util.Scanner ;
import java.util.Random;

public class AverageNumbers
{

	public static void main(String[]args)
	{
		Random rand= new Random();
		int [] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i]=rand.nextInt(100)+1;
		}
		for (int num : numbers) 
		{
			System.out.print(num + " ");
		}	
		System.out.println("\nThe average of the numbers is...... " + average(numbers));
	}
	
	
	public static double average(int [] num)
	{
		int average=0;
		for (int i = 0; i < num.length; i++)
		{
			average=average+num[i];
		}			
		return average/num.length;
	}	
}
