import java.util.Scanner;
public class Lesson_04
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		Lesson_04 form = new Lesson_04();
		String item1;
		double price1;
		String item2;
		double price2;
		String item3;
		double price3;
		double total;
		double Subtotal;
			//get info
			System.out.println("Please enter item 1:");
			item1=user_input.next();
			System.out.println("What is the price of item 1?");
			price1=user_input.nextDouble();
			System.out.println("Please enter item 2:");
			item2=user_input.next();
			System.out.println("What is the price of item 2?");
			price2=user_input.nextDouble();
			System.out.println("Please enter item 3:");
			item3=user_input.next();
			System.out.println("What is the price of item 3?");
			price3=user_input.nextDouble();
			Subtotal=price1+price2+price3;
			total=Subtotal*1.08;
				//print 
				System.out.println("<<<<<__Receipt__>>>>>");
				form.format(item1,price1);
				form.format(item2,price2);
				form.format(item3,price3);
				System.out.println();
				form.format("Subtotal" ,Subtotal);
				form.format("Tax", 1.08);
				form.format("Total" ,total);
	}	
	//method
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
}