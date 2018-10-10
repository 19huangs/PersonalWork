package objectOriented;

public class WorkerTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker aafreen = new Worker();
		System.out.println("Hours: $" + aafreen.getHours());
		System.out.println("Rate of Pay: $" + aafreen.getPay());
		aafreen.setHours(7);
		aafreen.setPay(7.5);
		System.out.println("Set Hours: " + aafreen.getHours());
		System.out.println("Set Rate of Pay: $" + aafreen.getPay());
		System.out.println("Raise: $" + aafreen.raise());
		
		aafreen = new Worker(5, 7.5);
		System.out.println("Hours: " + aafreen.getHours());
		System.out.println("Rate of Pay: $" + aafreen.getPay());
		System.out.println("Raise: $" + aafreen.raise());
		aafreen.setHours(7);
		aafreen.setPay(7.5);
		System.out.println("Set Hours: " + aafreen.getHours());
		System.out.println("Set Rate of Pay: $" + aafreen.getPay());
		System.out.println("Raise: $" + aafreen.raise());
	}

}
