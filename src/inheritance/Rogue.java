package inheritance;
import java.util.Random;
public class Rogue extends Player{
	private int kills;
	
	public Rogue()
	{
		kills = 0;
	}
	
	public Rogue (int xKills)
	{
		kills = xKills;
	}
	
	public int getKills()
	{
		return kills;
	}
	public void setKills(int xKills)
	{
		kills = xKills;
	}
	public void move()
	{
		Random bob = new Random();
		int max = 50;
		int min = 1;
		
		
		int max1 = 4;
		int min1 = 1;
		
		
		int max2 = 5;
		int min2 = 1;
		
		super.setLocX(super.getLocX() + min+bob.nextInt(max-min+1));
		super.setLocY(super.getLocY() + min+bob.nextInt(max-min+1));
		
		if ((min1+bob.nextInt(max1-min1+1)) <=1)
		{
			super.setHealth(super.getHealth()-10);
		}
		
		if ((min2+bob.nextInt(max2-min2+1)) <=1)
		{
			kills++;
		}
	}
	
	public String stats()
	{
		return "Kills: " + kills + super.stats();
	}

}
