import java.util.Scanner;
public class ReturnScanner_average
{	
	static double num1;
	static double num2;
	static double num3;
	static double average;

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			//get info
			System.out.println("What is your first number?");
			num1 = user_input.nextInt();
			System.out.println("What is your second number?");
			num2 = user_input.nextInt();
			System.out.println("What is your third number?");
			num3 = user_input.nextInt();
			format();

			
	}	
	//method
	public static double average()
	{
		return((num1+num2+num3)/3);
	}
		
		//method
		public static void format()
		{
			System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %.5f\n", average());
		}

}