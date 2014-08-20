package proxy;

public class HQLStatement implements HQLInterface {

	@Override
	public void update(String f, String v) {
		System.out.println("update from"+f+v);
	}

	@Override
	public void find() {
		System.out.println("find from");

	}

}
