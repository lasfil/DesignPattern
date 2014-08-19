package flyweight;

public class Pear implements Fruit {
	private String name;

	protected Pear(String name) {
		super();
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println(name);
	}

}
