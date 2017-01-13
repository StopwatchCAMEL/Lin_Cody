import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter x1");
		int x1= user_input.nextInt();
		System.out.println("Please enter y1");
		int y1= user_input.nextInt();
		System.out.println("Please enter x2");
		int x2= user_input.nextInt();
		System.out.println("Please enter y2");
		int y2= user_input.nextInt();
		
		Distance object = new Distance(x1,y1,x2,y2);
		
		System.out.println("The distance from the coordinates " + object.getx1() + "," + object.gety1() + " to " + object.getx2() + "," + object.gety2() + " is " + object.getDist());
		
		System.out.println("Please enter x1");
		x1= user_input.nextInt();
		System.out.println("Please enter y1");
		y1= user_input.nextInt();
		System.out.println("Please enter x2");
		x2= user_input.nextInt();
		System.out.println("Please enter y2");
		y2= user_input.nextInt();
		object.setValues(x1,y1,x2,y2);
		System.out.println("The distance from the coordinates " + object.getx1() + "," + object.gety1() + " to " + object.getx2() + "," + object.gety2() + " is " + object.getDist());
	}

}

   //main() method
   //create a Scanner object
   //Take user input for x1, y1, x2, and y2

    //new Distance object @param x1, y1, x2, y2
  
   //print the distance with a label and number formatting
   //use accessors to retrieve the data
   //EX: distance = 22.35

    //Call setValues() to set new coordinates
   //print the distance just like before