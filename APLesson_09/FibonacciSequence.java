import java.util.Scanner ;
public class FibonacciSequence
{

	public static void main(String[]args)
	{
		int num;
		int size;

		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter your starting number");
		num=user_input.nextInt();
		System.out.println("Please enter your sequence size");
		size=user_input.nextInt();
		
		int [] seq = new int[size];
		
		for (int i = 0; i < seq.length; i++)
		{
			if (i==0 || i==1)
			{
				seq[i]=(num);
			}
			else
			{
				seq[i]=seq[i-1]+seq[i-2];
			}
			System.out.print(seq[i]+ " ");
		}
		
	
	}
}