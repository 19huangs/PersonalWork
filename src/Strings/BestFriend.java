package Strings;

public class BestFriend {
	private String friend1;
	private String friend2;
	private String friend3;
	
	public BestFriend()
	{
		friend1 = "Bob Smith";
		friend2 = "Judy Jones";
		friend3 = "Billy Miller";
	}
	
	public boolean changeFriend (String newName, int rank)
	{
		boolean replacement = true;
		if (newName.contains(" ") == true)
		{
			if (rank == 1)
				{
				friend1=newName;
				}
			if (rank == 2)
				{
				friend2=newName;
				}
			if (rank == 3)
				{
				friend3=newName;
				}
			
		}
		else
		{ 
			replacement = false;
		}
		
		return replacement;
	}
	
	public String getFriend1()
	{
		return friend1;
	}
	
	public int getLastLength3()
	{
		String last = friend3.substring((friend3.indexOf(" ")+1), (friend3.length()));
		int number = last.length();
		return number;
	}
	
}
