package designingClasses;

public class RaceHorse 
{
   private String name;
   private int numRaces;   //The total number of races the horse has run.
   private int numMiles;   //The total number of miles the horse has raced
   public RaceHorse()
   {
	   name = "";
	   numRaces = 0;
	   numMiles =0;
   }
   public RaceHorse(String xName, int xNumRaces, int xNumMiles)
   {
	   name = xName;
	   numRaces = xNumRaces;
	   numMiles = xNumMiles;
   }
   public String getName()
   {
	   return name;
   }
   public int getNumRaces()
   {
	   return numRaces;
   }
   public int getNumMiles()
   {
	   return numMiles;
   }
   public void setName(String xName)
   {
	 name = xName;  
   }
   public void setNumRaces(int xNumRaces)
   {
		 numRaces = xNumRaces;  
   }
   public void setNumMiles(int xNumMiles)
   {
		 numMiles = xNumMiles;  
   }
   public void race(int length)   //the method is passed the length of a single race
   {
	   numMiles +=length;
	   numRaces +=1;
   }
}
