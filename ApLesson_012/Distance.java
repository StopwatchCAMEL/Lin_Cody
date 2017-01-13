import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne=0;
		yOne=0;
		xTwo=0;
		yTwo=0;
		distance=0;
	}
	
	public Distance(int onex, int oney, int twox, int twoy)
	{
		xOne=onex;
		yOne=oney;
		xTwo=twox;
		yTwo=twoy;
		distance=0;
	}
	
	public void setValues(int onex, int oney, int twox, int twoy)
	{
		xOne=onex;
		yOne=oney;
		xTwo=twox;
		yTwo=twoy;
		distance=0;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
	
	public int getx1()
	{
		return xOne;
	}
	
	public int gety1()
	{
		return yOne;
	}
	
	public int getx2()
	{
		return xTwo;
	}
	
	public int gety2()
	{
		return yTwo; 
	}
}

 //declare instance variables…
   //integers xOne, yOne, xTwo, yTwo
   //double distance

    //constructor....
       //set all coordinates to 0
       //set distance to 0

    //constructor(parameters for xOne, yOne, xTwo, yTwo)
       //set coordinates to params
       //set distance to 0

    //Modifier: setValues()
       //reset coordinates of the two points

    //Accessor: getDist()
       //calculates and returns the distance between two points
       //distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
