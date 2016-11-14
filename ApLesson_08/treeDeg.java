import java.util.Scanner ;
public class treeDeg
{
	static String word;
	static int stop;
	static int start;
	
	
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter your word");
		word = user_input.next();
		stop = word.length();
		start=1;
		tree(word, stop, start);
	
	}
	
	public static void tree(String word, int stop, int start)
	{
		if (start <= stop)
		{
			System.out.printf("%10s\n", word.substring(0, start));
			start++;
			tree(word, stop, start);
		}
	}	
}