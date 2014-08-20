package proxy;

public class SQLStatement implements SQLInterface {

	@Override
	public void insert() {
		System.out.println("insert into");
	}

	@Override
	public void delete() {
		System.out.println("delete from");

	}

}
