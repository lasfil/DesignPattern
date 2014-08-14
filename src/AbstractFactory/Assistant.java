package AbstractFactory;

public class Assistant extends StyleEmployee {

	public Assistant(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Assistant's name: " + name;
	}

}
