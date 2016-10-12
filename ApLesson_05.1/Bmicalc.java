import java.util.Scanner;
public class Bmicalc
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			//variables
			double weight;
			double height;
			double bmi;
			
			
				//info 
				System.out.println("Welcome to the BMI Calculator!\nPlease enter your weight in pounds");
				weight=user_input.nextDouble();
				System.out.println("What is your total height in inches?");
				height=user_input.nextDouble();
				bmi= (weight/(height*height))*703;
				System.out.printf("Your bmi is %.2f", bmi);
				calcHealth(bmi);

	}	
	//method
	public static void calcHealth(double bmi)
	{
		if (bmi<=18.5)
			System.out.println("\nYou are underweight");
		else if (bmi < 25)
			System.out.println("\nYou have a normal weight");
		else if (bmi < 30)
			System.out.println("\nYou are overweight");
		else if (bmi < 35)
			System.out.println("\nYou are obese");
		else if (bmi < 40)
			System.out.println("\nYou are very obese");
		else
			System.out.println("\nYou are morbidly obese");
	}
		
}