package strategy;

public class CmpStrategyA implements CmpStrategy {

	@Override
	public int compare(Object o) {
		System.out.println("strategy A");
		return 1;

	}

}
