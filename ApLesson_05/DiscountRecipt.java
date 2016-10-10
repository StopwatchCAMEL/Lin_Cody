import java.util.Scanner;
public class DiscountRecipt
{
	static double subtotal;
	static double total; 
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		//variables
		String item1;
		double price1;
		String item2;
		double price2;
		String item3;
		double price3;
		double price4;
		String item4;
		double dis;
		double tax;
	
		
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
			System.out.println("Please enter item 4");
			item4=user_input.next();
			System.out.println("What is the price of item 4?");
			price4=user_input.nextDouble();
			subtotal=(price1+price2+price3+price4);
			tax=(subtotal*1.08)-subtotal;
			discount();
			dis= subtotal-total;
			total=total+tax;
				
				//print info
				System.out.println("<<<<<__Receipt__>>>>>");
				format(item1,price1);
				format(item2,price2);
				format(item3,price3);
				format(item4,price4);
				System.out.println();
				format("Subtotal" ,subtotal);
				format("Tax", tax);
				format("Total" ,total);
				format("Savings", dis);
				System.out.println("______________________");
				System.out.println("Thank you for shopping");
	}	
	//method
	public static void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
	
	public static void discount()
	{
		if(subtotal>=2000)
			total=(subtotal*.85);
			
	}
		
}
	