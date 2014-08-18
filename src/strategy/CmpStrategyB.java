package strategy;

public class CmpStrategyB implements CmpStrategy{

	@Override
	public int compare(Object o) {
		System.out.println("strategy B");
		return -1;
		
		
	}

}
