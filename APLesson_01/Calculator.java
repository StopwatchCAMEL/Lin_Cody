import java.util.Scanner;
public class Calculator
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		int num1;
		int	num2;
		int num3;
		int total; 
			System.out.println("What is the length?");
			num1 = user_input.nextInt();
			System.out.println("What is the height?");
			num2 = user_input.nextInt();
			System.out.println("What is the width?");
			num3 = user_input.nextInt();
			total = (2*num1*num3+2*num1*num2+2*num2*num3);
				System.out.println("The surface area of your rectangle is" );
				System.out.println(total);
				System.out.print(num1);
				System.out.print(" and");
				System.out.print(num2);
				System.out.print(" would produce");
				System.out.print(num1*num2);
		
	}
}