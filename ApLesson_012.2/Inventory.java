public class Inventory
{
	private String manufacturer,name,category;
	private int upc;
	private double price;
	
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		upc = 0;
		price = 0;
	}
	public Inventory(String man, String nam)
	{
		manufacturer = man;
		name = nam;
		category = "Undefined";
		price = 0;
		upc = (int)(Math.random() * 1000000) + 1;
	}
	
	public Inventory(String man, String nam, String cat, double pri)
	{
		manufacturer = man;
		name = nam;
		category = cat;
		price = pri;
		upc = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setCat(String cat)
	{
		category=cat;
	}
	
	public void setPrice(double pri)
	{
		price = pri; 
	}

	public String toString()
	{
		return "Customer Info...\nItem Name: " + name +
							"\nItem Manufacturer: " + manufacturer +
							"\nItem Category: " + category +
							"\nPrice: " + price +
							"\nUPC: " + upc;
	}
}


