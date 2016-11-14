import java.util.Scanner ;
public class Center
{
	static String word1;
	static String word2;
	static String word3;
	
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter your first word");
		word1=user_input.next();
		System.out.println("Please enter your second word");
		word2=user_input.next();
		System.out.println("Please enter your third word");
		word3=user_input.next();
		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	
	}
	
	public static String makeCenter(String word)
	{
		if (word.length()>=20)
		{
			return(word);
		}
		else
		{
			return makeCenter(" " + word + " ");
		}
	}	
}