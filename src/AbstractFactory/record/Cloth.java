package AbstractFactory.record;

public class Cloth extends SalesProduct {

	protected Cloth(int i) {
		this.price = i;
	}
	
	@Override
	public String getPrice() {
		return "cloth price: "+ price;
	}

	
}
