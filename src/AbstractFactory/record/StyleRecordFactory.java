package AbstractFactory.record;



public class StyleRecordFactory implements RecordFactory {

	@Override
	public Record createRecord(String eName,int price, String portion, String aName) {
		Employee designer = new Designer(eName,portion);
		Product p = new Shampoo(price);
		StyleRecord r = new StyleRecord();
		r.setEmployee(designer);
		r.setProduct(p);
		
		Employee a = new Assistant(aName);
		r.setAssistant(a);

		return r;
	}

}
