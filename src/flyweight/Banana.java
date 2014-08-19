package flyweight;

public class Banana implements Fruit {
	private String name;

	public Banana(String name) {
		super();
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println(name);
	}

}
