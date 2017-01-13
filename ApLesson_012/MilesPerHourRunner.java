import java.util.Scanner;
public class MilesPerHourRunner
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter a distance");
		int dist= user_input.nextInt();
			System.out.println("Please enter the amount of hours");
		int hour= user_input.nextInt();
			System.out.println("Please enter the amount of minutes");
		int min= user_input.nextInt();
		
		MilesPerHour object = new MilesPerHour(dist,hour,min);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH()+ " mph");
		
		System.out.println("Please enter a distance");
		dist= user_input.nextInt();
		System.out.println("Please enter the amount of hours");
		hour= user_input.nextInt();
		System.out.println("Please enter the amount of minutes");
		min= user_input.nextInt();
		object.setValues(dist,hour,min);
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH()+ " mph");
	}
}




   //main() method

    //create a Scanner object
   //get user inputs for distance, hours, and minutes

    //instantiate a new MilesPerHour object
   //@param distance, hours, and minutes

    //print the info, formatted nicely....
   //make sure to use the accessors for the data
   //EX: 10 miles in 2 hours = 5 mph

    //run the modifier: setValues()
   //set new distance, hours, and minutes

    //print the info, formatted nicely....
   //EX: 10 miles in 2 hours = 5 mph