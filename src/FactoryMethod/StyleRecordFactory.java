package FactoryMethod;

public class StyleRecordFactory implements RecordFactory {

	@Override
	public Record createRecord() {

		return new StyleRecord();
	}

}
