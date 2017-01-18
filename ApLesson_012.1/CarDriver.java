import java.util.Scanner;
public class CarDriver
{
   public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter a paint");
		String p= user_input.nextLine();
		System.out.println("Please enter an interior");
		String i= user_input.nextLine();
		System.out.println("Please enter an engine");
		String e= user_input.nextLine();
		System.out.println("Please enter tires ");
		String t= user_input.nextLine();
		
		CarClass object = new CarClass(p,i,e,t);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint :" + object.getPaint());
		System.out.println("Interior :" + object.getInterior());
		System.out.println("Engine :" + object.getEngine());
		System.out.println("Tires :" + object.getTires());
     }
}