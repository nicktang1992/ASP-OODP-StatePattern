package statePattern;

public class Client {

	public static void main(String[] args) {
		Person jack = new Person("Jack");
		jack.getDivorced();
		jack.getWidowed();
		jack.printStatus();
		System.out.println();
		
		jack.getMarried();
		jack.printStatus();
		System.out.println();

		jack.getWidowed();
		jack.printStatus();
		System.out.println();

		jack.getDivorced();
		jack.printStatus();
		System.out.println();

		jack.getMarried();
		jack.getDivorced();
		jack.printStatus();
		System.out.println();

		jack.getWidowed();
		jack.printStatus();
		System.out.println();

		jack.getMarried();
		jack.printStatus();
		System.out.println();

	}

}
