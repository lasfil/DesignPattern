package facade;

public class Bank {
	private Electricity e;
	private Water w;
	private Mobile m;
	
	public Bank() {
		e = new Electricity();
		w = new Water();
		m = new Mobile();
	}
	
	public void all() {
		e.buy();
		w.buy();
		m.topup();
	}
}
