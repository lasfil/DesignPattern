package state;

public class PassageState implements State {

	@Override
	public void forward(Order order) {
		if (order.isPassage()) {
			if (order.getAddress() == null || order.getAddress().length() == 0) {
				order.setCancled(true);
				order.setState(new CancledState());
				
			} else {
				
				System.out.println("delivering to customer");
				order.setDelivered(true);
				order.setState(new DeliveredState());
			}
			
			order.forward();
		}

	}

}
