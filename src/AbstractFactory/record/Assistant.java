package AbstractFactory.record;



public class Assistant extends StyleEmployee {

	protected Assistant(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Assistant's name: " + name;
	}

}
