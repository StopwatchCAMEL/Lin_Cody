public class Toyota extends Car
{
	private double xLocation, yLocation;
	private double[] location = new double[2];
	private int ID;
	
	public Toyota()
	{
		location[0] = 0; 
		location[1] = 0;
		ID = (int) (Math.random()*1000000+1);	
	}
	
	public Toyota(String l)
	{
		String[] locs = l.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
		ID = (int) (Math.random()*1000000+1);	
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] = x; 
		location[1] = y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
}
	