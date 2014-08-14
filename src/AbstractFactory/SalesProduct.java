package AbstractFactory;

//不会具体产生SalesProduct的实例，所以定义为抽象的
public abstract class SalesProduct implements Product {
	protected int price;

	@Override
	public abstract String getPrice();

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

}
