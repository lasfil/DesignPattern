package AbstractFactory;

import AbstractFactory.employee.Employee;

public class StyleEmployee implements Employee {
	protected String name;

	public StyleEmployee(String eName) {
		this.name = eName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
