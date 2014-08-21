package mediator;

import java.util.List;


public interface Mediator {

	void findBuyer(Trader trader);

	void findSeller(Trader trader);
	
	List<Trader> getTraders();
	 

}
