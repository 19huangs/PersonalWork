package objectOriented;

public class EmployeeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee aafreen = new Employee();
System.out.println(aafreen.getWage());
aafreen.setWage(5);
System.out.println(aafreen.getWage());
aafreen.raise();
System.out.println(aafreen.getWage());

System.out.println(aafreen.getExperience());
aafreen.setExperience(5);
System.out.println(aafreen.getExperience() + " years");
	}
}
