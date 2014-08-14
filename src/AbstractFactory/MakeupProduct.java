package AbstractFactory;

public abstract class MakeupProduct implements Product {
	protected int price;

	@Override
	public abstract String getPrice();

	@Override
	public void setPrice(int price) {
		this.price = price;
	}
}
