import java.util.Scanner ;
public class Reverseword
{

	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter 5 names");
		
		for (int i = 0; i < names.length; i++)
		{
			names[i]=user_input.next();
		}
		
		System.out.println("\nIn order");
		
		for (String name : names) 
		{
			System.out.println(name);
		}	
		System.out.println("\nReversed");
		reverse(names);
		
	}

	public static void reverse(String [] names)
	{
		for (int i=names.length-1; i>=0; i--)
		{
			System.out.println(names[i]);
		}
	}	
}