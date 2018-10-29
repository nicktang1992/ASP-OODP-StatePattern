package statePattern;

public class Married implements MaritalStatus {

	@Override
	public void getMarried(Person person) {
		System.out.println(person.getName()+" is already married. He can't marry again");
		
	}
	@Override
	public void getWidowed(Person person) {
		person.setStatus(new Widowed());
		System.out.println(person.getName()+" gets Widowed");
	}
	@Override
	public void getDivorced(Person person) {
		person.setStatus(new Divorced());
		System.out.println(person.getName()+" gets Divorced");
	}
	
	@Override
	public String toString() {
		return "Married";
	}
	
}
