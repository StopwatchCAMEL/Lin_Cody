import java.util.Scanner;
public class ReturnScanner_cube
{	

	static double side;
	static double calcSurf;

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			//get info
			System.out.println("What is the side length of your cube?");
			side = user_input.nextInt();
			format();

			
	}	
	//method
	public static double calcSurf()
	{
		return((side * side)*6);
	}
		
		//method
		public static void format()
		{
			System.out.printf("The surface area of a cube with the side lenghts of " + side + " is %.5f\n", calcSurf());
		}

}