package AbstractFactory;

import AbstractFactory.employee.Employee;

public class SalesRecordFactory implements RecordFactory {

	@Override
	public Record createRecord(String eName, int price, String portion, String aName) {
		Product sp = new Cloth(price);
		Employee se = new StyleEmployee(eName);
		SalesRecord r = new SalesRecord();
		r.setEmployee(se);
		r.setProduct(sp);
		return r;
	}

}
