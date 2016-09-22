import java.util.Scanner;
public class Lesson_04Ex03
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		Lesson_04Ex03 cats = new Lesson_04Ex03();
		
		//variables
		double interest;
		double principal;
		double compounded;
		double life;
		double total;
		double monthly;
		
			//get info
			System.out.println("What is your interest rate in percentage?");
			interest = user_input.nextDouble();
			System.out.println("What is your principal?");
			principal = user_input.nextDouble();
			System.out.println("How many time is the loan compounded per year?");
			compounded = user_input.nextDouble();
			System.out.println("What is the life of the loan in years? ");
			life = user_input.nextDouble();
			total= 0;
			monthly = cats.calc(interest, principal, compounded, life, total);
			System.out.printf("The monthly payment is %10.2f\n", monthly);

			
	}	
	//method
	public double calc(double interest1, double principal1, double compounded1, double life1, double total)
	{
		total = (principal1*(Math.pow (1+(interest1/compounded1),compounded1*life1)));
		return (total/(life1*12));
	}
}