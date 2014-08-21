package memento;

import java.util.Calendar;

public class Memento implements IMemento{
	private int status;
	private Calendar timestamp;

	public Calendar getTimestamp() {
		return timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Memento(int status) {
		super();
		this.status = status;
		timestamp = Calendar.getInstance();
	}
}
