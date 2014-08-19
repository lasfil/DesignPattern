package flyweight;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGetFruit {

	@Test
	public void test() {
		FruitFactory f = new FruitFactory();
		Fruit a1 = f.getFruit("a1");
		Fruit a2 = f.getFruit("a1");

		a2.printName();
		Apple apple2 = (Apple) a2;
		apple2.setName("a2");
		//a1和a2共享同一对象，所以a2改名后a1跟着一起改
		a1.printName();
		Fruit a3 = new Apple("a1");

		Fruit b1 = f.getFruit("b1");
		
		Banana b2 = (Banana) f.getFruit("b1");
		Banana b3 = new Banana("b1");
	}

}