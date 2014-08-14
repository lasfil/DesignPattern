package AbstractFactory.employee;

public class Dresser implements Employee {
	private String name;

	public Dresser(String eName) {
		this.name = eName;
	}

	@Override
	public String getName() {
		return "Dresser: " + name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
