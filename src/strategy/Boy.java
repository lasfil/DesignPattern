package strategy;

public class Boy {
	private CmpStrategy comparator;

	public Boy(CmpStrategy comparator) {
		super();
		this.comparator = comparator;
	}
	
	public int compareTo(Boy b) {
		return comparator.compare(b);
	}

}
