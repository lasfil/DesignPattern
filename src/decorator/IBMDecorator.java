package decorator;

public class IBMDecorator extends Decorator {

	public IBMDecorator(Computer c) {
		super(c);
	}

	public void instalIBM() {
		System.out.println("IBM decorator");
	}

	@Override
	public void funcList() {
		//System.out.println("function list: ");

		c.funcList();
		this.instalIBM();
	}

}
