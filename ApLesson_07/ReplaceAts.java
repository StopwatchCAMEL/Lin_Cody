import java.util.Scanner;
public class ReplaceAts
{	

	static String sentence;

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
		System.out.println("Please enter a sentence ");
		sentence = user_input.nextLine();
		
		while (sentence.indexOf("a")>=0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + ("@")+ sentence.substring(sentence.indexOf("a")+1);
		}
		System.out.println(sentence);
			
	}	

}