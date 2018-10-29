package statePattern;

import java.util.List;

public class Person {
	private MaritalStatus status;
	private String name;
	private List<String> history;
	
	public void setStatus(String name) {
		this.status = new Single();
		this.name = name;
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
	
	
}
