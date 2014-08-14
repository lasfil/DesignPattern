package FactoryMethod;

import org.junit.Test;

public class RecordFactoryTest {
	@Test
	public void factoryMethodTest() {
		RecordFactory styleRecordFactory = new StyleRecordFactory();
		Record style = styleRecordFactory.createRecord();
		style.setCommission();
		
		RecordFactory salesRecordFactory = new SalesRecordFactory();
		Record sales = salesRecordFactory.createRecord();
		sales.setCommission();
	}
}
