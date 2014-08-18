package decorator;

public class DellDecorator extends Decorator {

	public DellDecorator(Computer c) {
		super(c);
	}

	public void installDell() {
		System.out.println("install dell decorator");
	}

	@Override
	public void funcList() {
		//System.out.println("function list: ");
		c.funcList();
		this.installDell();
	}

}
