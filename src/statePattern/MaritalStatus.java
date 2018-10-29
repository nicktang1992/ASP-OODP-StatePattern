package statePattern;

public interface MaritalStatus {
	
	public void getMarried(Person person,Person spouse);
	
	public void spouseDied(Person person);
	
	public void getDivorced(Person person);
}
