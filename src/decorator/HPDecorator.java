package decorator;

public class HPDecorator extends Decorator{

	
	public HPDecorator(Computer c) {
		super(c);
	}
	
	public void instalHP() {
		System.out.println("HP decorator");
	}

	@Override
	public void funcList() {
		//System.out.println("function list: ");

		c.funcList();
		this.instalHP();
	}
	

}
