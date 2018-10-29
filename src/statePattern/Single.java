package statePattern;

public class Single implements MaritalStatus {

	@Override
	public void getMarried(Person person,Person spouse) {
		person.setStatus(new Married());
		System.out.println(person.getName()+" gets married");
		
	}

	@Override
	public void spouseDied(Person person) {
		System.out.println(person.getName()+" is currently single. Cant get widowed without a spouse!");
		
	}

	@Override
	public void getDivorced(Person person) {
		System.out.println(person.getName()+" is currently single. Cant get divorced without a spouse!");

	}

}
