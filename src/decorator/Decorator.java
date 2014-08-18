package decorator;

public abstract class Decorator implements Computer{
	protected Computer c;

	public Decorator(Computer c) {
		super();
		this.c = c;
	}
	
	
	public abstract void funcList();

}
