package FactoryMethod;

public class SalesRecordFactory implements RecordFactory {

	@Override
	public Record createRecord() {

		return new SalesRecord();
	}

}
