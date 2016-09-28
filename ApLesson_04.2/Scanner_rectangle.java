import java.util.Scanner;
public class Scanner_rectangle
{	
	static double width;
	static double length;
	static double perimeter;

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			//get info
			System.out.println("What is the width of your rectangle?");
			width = user_input.nextInt();
			System.out.println("What is the length of your rectangle?");
			length = user_input.nextInt();
			format();

			
	}	
	//method
	public static double perimeter()
	{
		return((2*length)+(2*width));
	}
		
		//method
		public static void format()
		{
			System.out.printf("The perimeter is %.5f\n", perimeter());
		}

}
