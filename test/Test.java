import static org.junit.Assert.*;

import java.util.Calendar;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import template.AppleCake;
import template.FruitCake;
import flyweight.Apple;
import flyweight.Fruit;

public class Test {

	@org.junit.Test
	public void test() throws ParserConfigurationException {
		//DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//dbf.newDocumentBuilder();
		FruitCake applecake = new AppleCake();
	}
}
