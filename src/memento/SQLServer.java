package memento;

public class SQLServer {
	private int status;
	
	public void setStatus(int status) {
		this.status = status;
	}

	public IMemento createMemento() {
		IMemento m = new Memento(status);
		System.out.println("Server status: "+ ((Memento) m).getStatus() + "backup at" + ((Memento) m).getTimestamp().getTime());
		return  m;
	}
	
	public void reverte(IMemento im) {
		Memento m = (Memento) im;
		this.status = m.getStatus();
		System.out.println("Server reverte at" + m.getTimestamp().getTime() + "to status" + status);
	}
}
