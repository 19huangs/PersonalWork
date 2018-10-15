package objectOriented;

public class CatTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat aafreen = new Cat();
		System.out.println("Age: " + aafreen.getAge());
		System.out.println("Hours of Sleep: " + aafreen.getSleep());
		aafreen.setAge(7);
		aafreen.setSleepMore(7.5);
		System.out.println("Age: " + aafreen.getAge() + " years old \n" );
		
		System.out.println("More Hours of Sleep: " + aafreen.getSleep() + " hours");
		aafreen.setSleepLess(7.5);
		System.out.println("Less Hours of Sleep: " + aafreen.getSleep() + " hours");
		System.out.println("Age after Birthday: " + aafreen.getBirthday() + " years old");
	}

}