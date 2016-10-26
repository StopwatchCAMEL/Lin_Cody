public class Song
{	

	public static void main(String[]args)
	{
		Sing("Na", 4);
		Sing("Na", 4);
		Sing("Hey", 3); 
		Sing("Goodbye!", 1);
	}	
			//method
	public static void Sing(String song, int times)
	{
		for (int count=1; count<=times; count++)
		{
		System.out.print(song + " ");
		}
		System.out.println();
	}
}