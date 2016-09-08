import java.util.Scanner;
public class Lab3
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		String name;
		int age;
		String fun;
		String music;
		int siblings;
		String job;
		int height;
		int weight;
		int total;
		int num1;
		int num2;
		//Rude AI
			System.out.println("Hello my name is Watson?");
			System.out.println("I would like to ask you a few questions");
			System.out.println("What is your name? ");
			name = user_input.next();
			System.out.println(name + " ewww what a terrible name");
			System.out.println("How old are you " + name);
			age = user_input.nextInt();
			System.out.println(age + " huh you look old for your age");
			System.out.println("What do you like to do for fun?");
			fun = user_input.next();
			System.out.println(fun + " is that similar to a stick and hoop?");
			System.out.println("What kind of music do like " + name );
			music = user_input.next();
			System.out.println(music + " ...? that's worst than country");
			System.out.println("How many siblings do you have ?");
			siblings = user_input.nextInt();
			System.out.println(siblings + " siblings, wow I hope they look better than you do");
			System.out.println("What would you like to be when you grow up?");
			job = user_input.next();
			System.out.println("Good luck becoming a " + job + " with your IQ");
			
			//Bmi calculation 
				System.out.println("How tall are you in meters?");
				height = user_input.nextInt();
				System.out.println("How much do you weigh in kg?");
				weight = user_input.nextInt();
				total= weight/height/height;  
				System.out.println("Your BMI is " + total);
					
					//Calculation
					System.out.println("What is your first number?");
					num1 = user_input.nextInt();
					System.out.println("What is your second number?");
					num2 = user_input.nextInt();
					System.out.println(num1 + " and " + num2 + " would produce " + num1*num2);
					
				
	}
}