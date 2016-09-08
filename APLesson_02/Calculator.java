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
		String name;
		int housenum;
		String street;
		String city;
		int zipcode;
		//Complex Calculation
			System.out.println("What is the length?");
			num1 = user_input.nextInt();
			System.out.println("What is the height?");
			num2 = user_input.nextInt();
			System.out.println("What is the width?");
			num3 = user_input.nextInt();
			total = (2*num1*num3+2*num1*num2+2*num2*num3);
			System.out.println("The surface area of your rectangle is" );
			System.out.println(total);
			//Multiplication
				System.out.println(num1 + " and " + num2 + " would produce " + num1*num2);
					//Concatenation
					System.out.println("What is your name? ");
					name = user_input.next();
					System.out.println("What is your house number?");
					housenum = user_input.nextInt();
					System.out.println("What is your street name");
					street = user_input.next();
					System.out.println("What city do you live in?");
					city = user_input.next();
					System.out.println("What is your zipcode?");
					zipcode = user_input.nextInt();
					System.out.print("Your name is. " + name);
					System.out.println(" You live at");
					System.out.print(housenum + " " + street + " " + city + " " + zipcode);
				
	}
}