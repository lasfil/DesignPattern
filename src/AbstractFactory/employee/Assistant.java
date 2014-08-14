package AbstractFactory.employee;

import AbstractFactory.StyleEmployee;


public class Assistant extends StyleEmployee {

	public Assistant(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Assistant's name: " + name;
	}

}
