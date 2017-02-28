public class GameRunner 
{
	public static void main(String[]args)
	{

		GameSystem g2 = new XBox("Something");
		GameSystem g4 = new PlayStation("Meow");
		GameSystem g6 = new PC("Cats");
		
	
		System.out.println(g2);
		System.out.println(g4);
		System.out.println(g6);
		
	}
}