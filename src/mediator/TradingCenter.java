package mediator;

import java.util.ArrayList;
import java.util.List;

public class TradingCenter implements Mediator {
	private List<Trader> traders = new ArrayList<Trader>();

	public List<Trader> getTraders() {
		return traders;
	}

	public void setTraders(List<Trader> traders) {
		this.traders = traders;
	}

	@Override
	public void findSeller(Trader trader) {

		for (Trader t : traders) {

			if (t.getClass().equals(trader.getClass())) {
				for (String goods : trader.getBuy().keySet()) {

					if (t.getSell().keySet().contains(goods)) {
						trader.addSeller(goods, t);

					}

				}
			}

		}

	}

	@Override
	public void findBuyer(Trader trader) {
		for (Trader t : traders) {
			if (t.getClass().equals(trader.getClass())) {
				for (String goods : trader.getSell().keySet()) {

					if (t.getBuy().keySet().contains(goods)) {
						trader.addBuyer(goods, t);

					}
				}
			}
		}

	}

}
