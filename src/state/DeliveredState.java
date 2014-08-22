package state;

public class DeliveredState implements State {

	@Override
	public void forward(Order order) {
		if(order.isDelivered()) {
			System.out.println("order is finished");
		}

	}

}
