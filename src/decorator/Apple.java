package decorator;

public class Apple implements Computer {

	public void installCPU() {
		System.out.println("apple cpu");
	}

	@Override
	public void funcList() {
		System.out.println("function list: ");
		this.installCPU();
	}

}
