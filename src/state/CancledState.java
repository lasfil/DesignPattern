package state;

public class CancledState implements State {

	@Override
	public void forward(Order order) {
		System.out.println("out of stock, order cacled, refund to customer");
		order.setPayed(false);
		if(order.isPassage())
			Stock.cancle(order.getProduct());
		order.setPassage(false);

	}



	

}
