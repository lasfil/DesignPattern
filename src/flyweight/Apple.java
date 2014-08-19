package flyweight;

public class Apple implements Fruit {
	private String name;


	// 苹果作为共享的享元类，只能由工厂创建，所以将构造方法设为protected
	protected Apple(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println(name);
	}

}
