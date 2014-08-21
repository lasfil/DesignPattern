package template;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitCakeTest {

	@Test
	public void test() {
		FruitCake applecake = new AppleCake();
		applecake.makeCake();
		FruitCake bcake = new MongoCake();
		bcake.makeCake();
	}

}
