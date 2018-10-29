package statePattern;

import java.util.Date;

public class Married implements MaritalStatus {
	Person spouse;
	@Override
	public void getMarried(Person person,Person spouse) {
		person.setStatus(new Divorced());
		spouse.setStatus(new Divorced());
	}
	@Override
	public void spouseDied(Person person) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getDivorced(Person person) {
		// TODO Auto-generated method stub
		
	}
	
}
