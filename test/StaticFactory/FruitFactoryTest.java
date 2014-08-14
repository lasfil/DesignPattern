package StaticFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitFactoryTest {

	@Test
	public void test() throws ClassNotFoundException {
		
		FruitFactory.getFruit(Class.forName("StaticFactory.Apple")).get();
		FruitFactory.getFruit(Banana.class).get();
	}

}
