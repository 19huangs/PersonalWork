package designingClasses;

public class Employee {
	private double wage; 				// instance field
	private int experience;
	
	public Employee() {
		wage = -999.99;	
		experience = -999;
	}
	
	public Employee(double xWage, int xExperience)
	{
		wage = xWage;
		experience = xExperience;
	}
	
	public double getWage() {
		return wage;					// returning without parameters
	}
	

	public void setWage(double xWage) { // mutator method, does not return
		wage = xWage;					// current value
	}
	
	public int getExperience(){
		return experience;
	}
	
	
	
	public void setExperience (int xExperience) {
		experience = xExperience;
	}
	
	public void raise () { 
		wage = wage *1.1;	
	}
	
	public String toString()
	{
		return ("Wage: " + wage + " Experience: " + experience);
	}
	
	public boolean equals (Employee aafreen)
	{
		return (this.toString().equals(aafreen.toString()));
	}
	
	public Employee clone()
	{
		return new Employee (wage, experience);
	}
	
}