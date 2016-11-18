import java.util.Scanner;
import java.util.Random;

public class FindtheZ
{

	static Random rand= new Random();
	static String [] words = new String[5];
	static Scanner user_input = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		
		fillArray();
		System.out.println("These words have Z's.......");
		System.out.println(hasZs());
			
	}
	public static void fillArray()
	{
		System.out.println("Please Enter 5 words");
		for (int i = 0; i < words.length; i++)
		{
			words[i]=user_input.next();
		}
		System.out.println("For the following words.....");
		for (String word : words) 
		{
			System.out.print(word + " ");
		}	
		System.out.println("\n");
	}	
	public static String hasZs()
	{
		String zs="";
		for (String word : words)
		{
			if (word.indexOf("z")>=0)
			{	
			zs += word + " ";
			}
		}
		return zs;
	}	
} 