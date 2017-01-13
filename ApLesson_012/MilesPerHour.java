import java.lang.Math.*;
public class MilesPerHour
{
   private int distance, hours, minutes;
   private double mph;

   public MilesPerHour()
   {
	   distance=0;
	   hours=0;
	   minutes=0;
	   mph=0;
   }
   
   public MilesPerHour(int dist, int hour, int min)
   {
	   distance = dist;
	   hours = hour;
	   minutes = min;
	   mph=0;
   }
   
   public void setValues(int dist, int hour, int min)
   {
	   distance = dist;
	   hours = hour;
	   minutes = min;
	   mph=0;
   }
   public double getMPH()
   {
	   mph = Math.round(distance / (hours + (minutes / 60.0)));
	   return mph; 
   }
   
   public int getDistance()
   {
	   return distance;
   }
   
   public int getHours()
   {
	   return hours;
   }
   
   public int getMinutes()
   {
	   return minutes;
   }

}