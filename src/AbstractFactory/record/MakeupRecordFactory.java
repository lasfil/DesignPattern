package AbstractFactory.record;


public class MakeupRecordFactory implements RecordFactory {

	@Override
	public Record createRecord(String eName, int price, String portion, String aName) {
		Product sp = new Lipstick(price);
		Employee se = new Dresser(eName);
		MakeupRecord r = new MakeupRecord();
		r.setEmployee(se);
		r.setProduct(sp);
		return r;
	}

}
