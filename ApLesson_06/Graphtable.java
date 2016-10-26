import java.util.Scanner;
public class Graphtable
{	

	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);	
		
			int num;
			int table;
			int count;
			
				//info 
				System.out.println("Please enter an integer:");
				num=user_input.nextInt();
				System.out.println("Please enter your table size");
				table=user_input.nextInt();
				System.out.println ("\n  X :   Y");
				for (count=1; count<=table; count++)
				{
				System.out.printf("%3d : %3d\n", count, count*num);
				
				}

	}	
		
}