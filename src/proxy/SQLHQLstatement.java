package proxy;

public class SQLHQLstatement implements SQLInterface, HQLInterface {

	@Override
	public void insert() {
		System.out.println("insert into");
	}

	@Override
	public void delete() {
		System.out.println("delete from");

	}

	@Override
	public void update(String f, String v) {
		System.out.println("update from" + f + v);
	}

	@Override
	public void find() {
		System.out.println("find from");

	}

}
