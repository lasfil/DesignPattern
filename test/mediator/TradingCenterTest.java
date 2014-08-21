package mediator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TradingCenterTest {

	@Test
	public void test() {
		TradingCenter tc = new TradingCenter();
		Trader f1 = new FruitTrader(tc,"f1");
		Trader f2 = new FruitTrader(tc,"f2");
		Trader f3 = new FruitTrader(tc,"f3");
		Trader c1 = new ClothTrader(tc,"c1");
		Trader c2 = new ClothTrader(tc,"c2");
		Trader c3 = new ClothTrader(tc,"c3");
		f1.buy("apple");
		f1.buy("banana");
		f1.buy("pear");
		f1.sell("fa");
		f1.sell("fc");
		
		f2.buy("fa");
		f2.buy("fb");
		f2.sell("pear");
		f2.sell("fc");
		
		f3.buy("fa");
		f3.buy("fc");
		f3.sell("pear");
		f3.sell("banana");
		
		c3.buy("fa");
		c3.buy("fc");
		c3.sell("pear");
		c3.sell("banana");
		
		
		
		f1.findBuyer();
		f2.findSeller();
		c3.findSeller();
		
		
	}

}
