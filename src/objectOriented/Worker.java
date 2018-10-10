package objectOriented;

public class Worker {
	private int hours;
	private double pay;

	public Worker() {
		hours = -999;
		pay = -999.99;
	}

	public Worker(int newHours, double newPay) {
		hours = newHours;
		pay = newPay;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int newHours) {
		hours = newHours;
	}

	public void setPay(double newPay) {
		pay = newPay;
	}

	public double getPay() {
		return pay;
	}

	public double payCheck() {
		return pay * hours;
	}

	public double raise() {
		return pay + 1.10;
	}
}
