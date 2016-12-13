import java.util.Random;
import java.util.Scanner;

public class Divisor
{
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		Random rand= new Random();
		int[][]nums = new int[4][4];
		
	
	for (int i=0; i<nums.length; i++)
	{
		for (int j=0; j<nums[i].length; j++) 
		{
			nums[i][j]= rand.nextInt(100)+1;
			System.out.print(nums[i][j]+ "\t");
		}
		System.out.println();
	}	
	
	System.out.println("Please enter a number");
	int divisor = user_input.nextInt();
	int count = 0;
	for (int i=0; i<nums.length; i++)
	{
		for (int j=0; j<nums[i].length; j++) 
		{
			if (nums[i][j]%2==0)
				count++;
		}
	}	
	System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array");
	}	
}