package state;

public class PayedState implements State {

	@Override
	public void forward(Order order) {
		if (order.isPayed()) {
			if (Stock.check(order.getProduct()) > 0) {
				System.out.println("order is prepared");
				order.setPassage(true);
				order.setState(new PassageState());
				
			} else {
				System.out.println("out of stock, order cancled");
				order.setCancled(true);
				order.setState(new CancledState());
				
			}
			
			order.forward();
		}

	}



	

}
