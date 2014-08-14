package AbstractFactory;

public class Shampoo extends HairProduct {

	public Shampoo(int price) {
		this.price = price;
	}
	
	@Override
	public String getPrice() {
		return "shampoo price: "+ price;
	}

}
