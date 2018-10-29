package statePattern;

public class Person {
	private MaritalStatus status;
	private String name;
	
	public Person(String name) {
		this.status = new Single();
		this.name = name;
		System.out.println(name+ " is born Single");
	}
	
	public MaritalStatus getStatus() {
		return this.status;
	}
	
	public void setStatus(MaritalStatus status) {
		this.status = status;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void getMarried() {
		this.getStatus().getMarried(this);
	}
	
	public void getDivorced() {
		this.getStatus().getDivorced(this);
	}

	public void getWidowed() {
		this.getStatus().getWidowed(this);
	}

	public void printStatus() {
		System.out.println(this.getName()+" is currently "+ this.getStatus().toString());
	}
}
