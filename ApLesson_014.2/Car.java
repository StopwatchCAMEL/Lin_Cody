public abstract class Car implements Location
{
	public double[] location;
	public final int ID = (int) (Math.random()*1000000+1);	
	
	public Car()
	{
		location = new double[2];
		
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y) 
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}
