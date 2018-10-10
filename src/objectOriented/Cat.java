package objectOriented;

public class Cat {
	private int age;
	private double hours;

	public Cat() {
		age = -999;
		hours = -999.99;
	}

	public int getAge() {
		return age;
	}

	public double getSleep() {
		return hours;
	}

	public double getBirthday() {
		return age + 1;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setSleepMore(double newHours) {
		hours = newHours + 1;
	}

	public void setSleepLess(double newHours) {
		hours = newHours - 1;
	}
}
