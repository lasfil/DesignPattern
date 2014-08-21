package template;

public abstract class FruitCake {
	public void makeCake() {
		addPowder();
		addMilk();
		addEgg();
		addFruit();
	}

	protected abstract void addFruit();

	private void addEgg() {
		System.out.println("add egg");
	}

	private void addMilk() {
		System.out.println("add milk");

	}

	private void addPowder() {
		System.out.println("add powder");

	}

}
