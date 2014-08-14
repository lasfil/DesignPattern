package AbstractFactory;

public class Cloth extends SalesProduct {

	public Cloth(int i) {
		this.price = i;
	}
	
	@Override
	public String getPrice() {
		return "cloth price: "+ price;
	}

	
}
