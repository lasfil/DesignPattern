package AbstractFactory.record;

public class Shampoo extends HairProduct {

	protected Shampoo(int price) {
		this.price = price;
	}
	
	@Override
	public String getPrice() {
		return "shampoo price: "+ price;
	}

}
