package AbstractFactory;

public class Lipstick extends MakeupProduct{
	
	public Lipstick(int i) {
		this.price = i;
	}
	
	@Override
	public String getPrice() {
		return "lipstick price: "+ price;
	}
}
