package strategy;

import org.junit.Test;

public class BoyTest {
	@Test
	public void test() {
		CmpStrategyA cmp = new CmpStrategyA();
		Boy tom = new Boy(cmp);
		Boy jerry = new Boy(cmp);
		System.out.println(tom.compareTo(jerry));
		System.out.println(jerry.compareTo(tom));
	}

}
