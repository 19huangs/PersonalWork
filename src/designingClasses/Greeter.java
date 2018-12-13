package designingClasses;

public class Greeter {
	private int age;
	// constructors - methods for constructing the object

	// default constructor

	public Greeter() {
		age = -999;

	}
	public Greeter(int xAge) {
		age = xAge;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int xAge) {
		age = xAge;
		
	}

	public void sayHello() {
		System.out.println("Hello");
		// Statements to initialize the state of the object
	}
}


