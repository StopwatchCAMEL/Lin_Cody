import java.util.Scanner;
public class Gpacalc
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			//variables
			String math;
			String history;
			String science;
			String Pe;
			String art;
			String english;
			String spanish;
			double gradepoints;
			double gpa;
			
			
				//info 
				System.out.println("Welcome to the Gpa Calculator!\nPlease enter your letter grade for history");
				history=user_input.next();
				System.out.println("What is your letter grade for math?");
				math=user_input.next();
				System.out.println("What is your letter grade for science?");
				science=user_input.next();
				System.out.println("What is your letter grade for P.E?");
				Pe=user_input.next();
				System.out.println("What is your letter grade for art?");
				art=user_input.next();
				System.out.println("What is your letter grade for english?");
				english=user_input.next();
				System.out.println("What is your letter grade for spanish?");
				spanish=user_input.next();
				gradepoints= calcPoints(math)+calcPoints(history)+calcPoints(science)+calcPoints(Pe)+calcPoints(art)+calcPoints(english)+calcPoints(spanish);
				gpa=gradepoints/7;
				System.out.printf("Your GPA is %.2f",gpa);
	}	
	//method
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		else return 0.0;
	}
		
}