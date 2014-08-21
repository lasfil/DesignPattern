package memento;

import java.util.Stack;

public class BackupServer {
	private Stack<IMemento> memStack = new Stack<IMemento>();
	private SQLServer server;
	
	public BackupServer(SQLServer server) {
		super();
		this.server = server;
	}

	public void backup() {
		memStack.push(server.createMemento());
		
	}
	
	public void reverte() {
		if(!memStack.isEmpty())
		server.reverte(memStack.pop());
	}
}
