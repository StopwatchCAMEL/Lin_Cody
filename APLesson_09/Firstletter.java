import java.util.Scanner ;
public class Firstletter
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
		first(names);
		
	
	}

	public static void first(String [] names)
	{
		for (String name : names) 
		{
			System.out.println(name.charAt(0));
		}	
	}	
}