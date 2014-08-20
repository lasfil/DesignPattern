package proxy;

public class HQLStatement implements HQLInterface {

	@Override
	public void update() {
		System.out.println("update from");
	}

	@Override
	public void find() {
		System.out.println("find from");

	}

}
