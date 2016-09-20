import java.util.Scanner;
public class Lesson_04Ex02
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		Lesson_04Ex02 form = new Lesson_04Ex02();
		String name;
		String Lname;
		String title;
		String School;
		String Subject;
		String year;
		
			//get info
			System.out.println("What is your first name?");
			name = user_input.nextLine();
			System.out.println("What is your last name");
			Lname = user_input.nextLine();
			System.out.println("What is your title?");
			title = user_input.nextLine();
			System.out.println("Enter your school site");
			School = user_input.nextLine();
			System.out.println("Enter your school year");
			year = user_input.nextLine();
			System.out.println("What is your subject?");
			Subject = user_input.nextLine();
			
			
				//print 
				
				System.out.println("***********");
				form.format(School,year);
				form.format(name,Lname);
				form.format(title,Subject);
				System.out.println();
			
	}	
	//method
	public void format(String word, String word2)
	{
		System.out.printf("\n%10s %10s", word, word2);
	}
}