package arrays;

public class DogClass {
	private String name;
	private int siblings;
	private int age;
	
	public DogClass()
		{
			String name ="Spot";
			int siblings = 0;
			int age = 0;
		}
	public DogClass(String xName, int xSiblings, int xAge)
	{
		name = xName;
		siblings = xSiblings;
		age = xAge;
		
		if (siblings<0)
		{
			siblings =0;
		}
		if (age<0)
		{
			age =0;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String xName)
	{
		 name =xName;
	}
	
	public int getSiblings()
	{
		return siblings;
	}
	
	public void setSiblings(int xSiblings)
	{
		siblings = xSiblings;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int xAge)
	{
		siblings = xAge;
	}
}
