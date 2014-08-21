package mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Trader {
	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	private Map<String, List<Trader>> buy;
	public Trader(Mediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
		buy = new HashMap<String, List<Trader>>();
		sell = new HashMap<String, List<Trader>>();
		this.mediator.getTraders().add(this);
		
	}

	private Map<String, List<Trader>> sell;

	public Map<String, List<Trader>> getBuy() {
		return buy;
	}

	public void setBuy(Map<String, List<Trader>> buy) {
		this.buy = buy;
	}

	public Map<String, List<Trader>> getSell() {
		return sell;
	}

	public void setSell(Map<String, List<Trader>> sell) {
		this.sell = sell;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void findBuyer() {
		mediator.findBuyer(this);
	}
	
	public void findSeller() {
		mediator.findSeller(this);
	}

	public void addSeller(String goods, Trader trader) {
		if (!buy.containsKey(goods))
			buy.put(goods, new ArrayList<Trader>());

		buy.get(goods).add(trader);
		
		System.out.println("The goods: " + goods + " has seller "
				+ trader.getName());
	}
	
	public void addBuyer(String goods, Trader trader) {
		if (!sell.containsKey(goods))
			sell.put(goods, new ArrayList<Trader>());

		sell.get(goods).add(trader);
		
		System.out.println("The goods: " + goods + " has buyer "
				+ trader.getName());
	}
	
	public void buy(String goods) {
		if (!buy.containsKey(goods))
			buy.put(goods, new ArrayList<Trader>());
	}
	
	public void sell(String goods) {
		if (!sell.containsKey(goods))
			sell.put(goods, new ArrayList<Trader>());
	}


}
