import java.util.Scanner;
public class Lesson_04EX04
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		Lesson_04EX04 turtle = new Lesson_04EX04();
		
		//variables
		double height;
		double length;
		double volume;
		double width;
		
			//get info
			System.out.println("What is the height of your box?");
			height = user_input.nextDouble();
			System.out.println("What is the length of your box?");
			length = user_input.nextDouble();
			System.out.println("What is the width of your box?");
			width = user_input.nextDouble();
			volume = turtle.calc(height, length, width);
			System.out.printf("The volume in cubic feet is %10.2f\n", volume);

			
	}	
	//method
	public double calc(double h, double l, double w)
	{
		return (h*l*w)/1728;
	}
}