package Strings;

public class Essay {
	private String name;
	private String text;

public Essay() {
	name = "";
	text = "";
}
	
	public void setAuthor (String xName)
	{
		name = xName;
	}
	public void setText (String xText)
	{
		text = xText;
	}
	
	public String getLastName()
	{
		String lastName = name.substring((name.indexOf(" ")+1), (name.length()));
		return lastName.toUpperCase();
		
	}
	
	public int getnumFirst()
	{
		String numFirst = name.substring(0,(name.indexOf(" ")));
		int number = numFirst.length();
		return number;
	}
	
	public boolean letter()
	{
		return name.contains("X");
	}
	
	public int getnumWords()
	{
		int words =1;
		for (int counter = 0; counter < text.length(); counter++)
		{
			if (text.charAt(counter) == ' ')
			{
				words ++;
			}
		}	
		return words;
	}	
}

