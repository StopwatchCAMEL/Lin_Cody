import java.util.Random;

public class RandomNumbers
{
	
	public static void main(String[]args)
	{
		Random rand= new Random();
		int[][]xAndO = new int[4][4];
		
		for (int i=0; i<xAndO.length; i++)
		{
			for (int j=0; j<xAndO[i].length; j++) 
			{
				xAndO[i][j]= rand.nextInt(100)+1;
			}
		}	
		
		for (int i=0; i<xAndO.length; i++)
		{
			for (int j=0; j<xAndO[i].length; j++) 
			{
				System.out.print(xAndO[i][j]+ "\t");
			}
			System.out.println();
		}	
	}

}