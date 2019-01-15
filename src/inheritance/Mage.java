package inheritance;
import java.util.Random;
public class Mage extends Player{
	private int spells;
	
	public Mage()
	{
		spells =0;
	}
	public Mage (int xSpells)
	{
		spells = xSpells;
	}
	public int getSpells()
	{
		return spells;
	}
	public void setSpells(int xSpells)
	{
		spells = xSpells;
	}
	public void move()
	{
		Random bob = new Random();
		Random bob2 = new Random();
		Random bob3 = new Random();
		int max = 10;
		int min = 1;
		int max2 =8;
		int min2 = 1;
		
		super.setLocX(super.getLocX() + min+bob.nextInt(max-min+1));
		super.setLocY(super.getLocY() + min+bob2.nextInt(max-min+1));
		
		if ((min+bob3.nextInt(max-min+1)) <=1)
		{
			super.setHealth(super.getHealth()-10);
		}
		if ((min2+bob3.nextInt(max2-min2+1)) <=1)
		{
			spells++;
		}
	}
	
	public String stats()
	{
		return "Mage = Number of spells: " + spells +super.stats();
	}
}
