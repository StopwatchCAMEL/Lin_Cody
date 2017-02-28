public class PC extends GameSystem
{
	public PC()
	{
		super();
		
		
	}
	
	public PC(String p)
	{
		super(p);
		
	}
	
	public String getController()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() +
							"\nSerial #: " + super.getSerialNo() +
							"\nController: " + getController() + "\n";
							
	}
}