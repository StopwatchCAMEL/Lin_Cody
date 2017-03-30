public class Honda extends Car
{
	private double[] location = new double[2];
	private int ID;
	
	public Honda()
	{
		location[0] = 0; 
		location[1] = 0;
		ID = (int) (Math.random()*1000000+1);	
	}
	
	public Honda(double[] locs)
	{
		location[0] = locs[0];
		location[1] = locs[1];
		ID = (int) (Math.random()*1000000+1);	
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] = x + location[0]; 
		location[1] = y + location[1];
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
}