package AbstractFactory.record;

public interface RecordFactory {

	Record createRecord(String eName, int price, String portion, String aName);
}
