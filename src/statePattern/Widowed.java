package statePattern;

public class Widowed implements MaritalStatus {

	@Override
	public void getMarried(Person person) {
		person.setStatus(new Married());
		System.out.println(person.getName()+" is nolonger widowed. He gets married again.");
	}

	@Override
	public void getWidowed(Person person) {
		System.out.println(person.getName()+" is already widowed. Can't get widowed again.");	
	}

	@Override
	public void getDivorced(Person person) {
		System.out.println(person.getName()+" is already widowed. Can't get widowed without a spouse.");
	}
	
	@Override
	public String toString() {
		return "Widowed";
	}

}
