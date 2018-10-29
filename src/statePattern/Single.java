package statePattern;

public class Single implements MaritalStatus {

	@Override
	public void getMarried(Person person) {
		person.setStatus(new Married());
		System.out.println(person.getName()+" gets married");	
	}

	@Override
	public void getWidowed(Person person) {
		System.out.println(person.getName()+" is currently single. Can't be widowed without a spouse!");
	}

	@Override
	public void getDivorced(Person person) {
		System.out.println(person.getName()+" is currently single. Can't get divorced without a spouse!");
	}
	
	@Override
	public String toString() {
		return "Single";
	}
}
