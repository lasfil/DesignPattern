package state;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void test() {
		Order o = new Order("book", "b");
		o.setPayed(true);
		o.forward();
		System.out.println("cancled: " + o.isCancled() + " Payed: "
				+ o.isPayed() + " Passaged: " + o.isPassage() + " Delivered: "
				+ o.isDelivered());
	}
}
