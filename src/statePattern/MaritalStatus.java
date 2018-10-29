package statePattern;

public interface MaritalStatus {
	
	public void getMarried(Person person);
	
	public void getWidowed(Person person);
	
	public void getDivorced(Person person);
	
	public String toString();
}
