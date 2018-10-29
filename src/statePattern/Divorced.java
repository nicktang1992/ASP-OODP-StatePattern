package statePattern;

public class Divorced implements MaritalStatus {

	@Override
	public void getMarried(Person person) {
		person.setStatus(new Married());
		System.out.println(person.getName()+" is no longer divorced. He gets married again.");
	}

	@Override
	public void getWidowed(Person person) {
		System.out.println(person.getName()+" is currently divorced. Can't get widowed without a spouse.");
	}

	@Override
	public void getDivorced(Person person) {
		System.out.println(person.getName()+" is already divoced. Can't get devorce again.");
	}
	
	@Override
	public String toString() {
		return "Divorced";
	}
	
}
