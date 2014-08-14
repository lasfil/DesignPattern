package AbstractFactory;

public class Designer extends StyleEmployee {
	public String portion;
	public Designer(String name, String portion) {
		super(name);
		this.portion = portion;
	}
	@Override
	public String getName() {
		return "Designer's name: " + name + " portion: " + portion;
	}

}
