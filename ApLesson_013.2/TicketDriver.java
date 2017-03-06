public class TicketDriver 
{
	public static void main(String[]args)
	{
		Walkup a = new Walkup();
		Advance b = new Advance(10);
		StudentAdvance c = new StudentAdvance(10);
		
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}