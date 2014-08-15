package AbstractFactory.record;

public class Lipstick extends MakeupProduct{
	
	protected Lipstick(int i) {
		this.price = i;
	}
	
	@Override
	public String getPrice() {
		return "lipstick price: "+ price;
	}
}
