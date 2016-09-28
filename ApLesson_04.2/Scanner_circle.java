import java.util.Scanner;
public class Scanner_circle
{	
	static double area ;
	static double radius;

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			//get info
			System.out.println("What is the radius of your circle?");
			radius = user_input.nextInt();
			format();

			
	}	
	//method
	public static double area()
	{
		return((radius*radius)*3.14);
	}
		
		//method
		public static void format()
		{
			System.out.printf("The area of a circle with the radius of " + radius + " is %.5f\n", area());
		}

}
