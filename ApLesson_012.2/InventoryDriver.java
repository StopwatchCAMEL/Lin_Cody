import java.util.Scanner;
public class InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter your item name");
		String name = user_input.nextLine();
		System.out.println("Please enter your manufacturer");
		String man = user_input.nextLine();
		System.out.println("Would you like to enter category and price information [y or n] ");
		String choice = user_input.nextLine();
		if (choice.equals("n"))
		{
			Inventory item1 = new Inventory(man,name);
			System.out.println(item1);
		}
		else 
		{
			System.out.println("Please enter a category");
			String cat = user_input.nextLine();
			System.out.println("Please enter a price");
			double price = user_input.nextDouble();
			Inventory item1 = new Inventory(man,name,cat,price);
			System.out.println(item1);
		}
		
	}

}