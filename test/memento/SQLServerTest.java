package memento;

import static org.junit.Assert.*;

import org.junit.Test;

public class SQLServerTest {

	@Test
	public void test() {
		SQLServer server = new SQLServer();
		BackupServer backup = new BackupServer(server);

		server.setStatus(10);
		backup.backup();

		server.setStatus(30);
		backup.backup();
		server.setStatus(40);
		server.setStatus(50);
		backup.backup();

		server.setStatus(35);
		backup.reverte();
		backup.reverte();
		backup.reverte();
		backup.reverte();
		backup.reverte();
	}

}
