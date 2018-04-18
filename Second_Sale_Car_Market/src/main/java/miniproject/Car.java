package miniproject;
import java.util.*;

public class Car implements java.io.Serializable
{
	private String model;
	private String manufacturer;
	private String information;
	private int year;
	private int price;
	private double kilometers;

	public Car(){}

	/**
	 * @param man manufacturers name
	 * @param mod model name
	 * @param info extra information about the car
	 */
	public Car(String man, String mod, String info)
	{
		model = mod;
		manufacturer = man.toUpperCase();
		information = info;
	}

	/**
	 * calculates using current year - model year
	 */
	public int getAge()
	{
		GregorianCalendar calendar = new GregorianCalendar();
		return (calendar.get(Calendar.YEAR) - year);
	}

	public String getInformation()
	{
		return information;
	}

	public double getKilometers()
	{
		return kilometers;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public String getModel()
	{
		return model;
	}

	public int getPrice()
	{
		return price;
	}

	public int getYear()
	{
		return year;
	}

	public void setInformation(String info)
	{
		information = info;
	}

	public void setKilometers(double km)
	{
		kilometers = km;
	}

	public void setManufacturer(String man)
	{
		manufacturer = man.toUpperCase();
	}

	public void setModel(String mod)
	{
		model = mod;
	}

	public void setPrice(int cost)
	{
		price = cost;
	}

	public void setYear(int yr)
	{
		year = yr;
	}
}
