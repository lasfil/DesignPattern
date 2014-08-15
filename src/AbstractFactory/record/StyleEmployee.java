package AbstractFactory.record;


public class StyleEmployee implements Employee {
	protected String name;

	protected StyleEmployee(String eName) {
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
