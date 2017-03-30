public class GMC extends Car
{
	private double xLocation, yLocation;
	private int ID;
	
	public GMC()
	{
		xLocation = 0; 
		yLocation = 0;
		ID = (int) (Math.random()*1000000+1);	
	}
	
	public GMC(double x, double y)
	{
		xLocation = x; 
		yLocation = y;
		ID = (int) (Math.random()*1000000+1);	
	}
	

	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		xLocation = x + xLocation; 
		yLocation = y + yLocation;
	}
	
	public double[] getLoc()
	{
		double[] location = {xLocation,yLocation};
		return location;
	}
	
}	