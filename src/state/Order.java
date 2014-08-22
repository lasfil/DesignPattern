package state;

public class Order {
	private boolean payed;
	private boolean prepared;
	private boolean cancled;
	private String product;
	private String address;



	public String getAddress() {
		return address;
	}



	private boolean delivered;

	private boolean passage;
	private State state;



	public Order(String product, String address) {
		super();
		this.product = product;
		this.address = address;
		this.state = new PayedState();
	}

	

	public void forward() {
		//System.out.println("email customer order forwarded");
		state.forward(this);
		
		
	}

	public String getProduct() {
		return product;
	}

	public State getState() {
		return state;
	}

	public boolean isCancled() {
		return cancled;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public boolean isPassage() {
		return passage;
	}

	public boolean isPayed() {
		return payed;
	}

	public boolean isPrepared() {
		return prepared;
	}

	

	public void newOrder() {
		state = new PayedState();
		state.forward(this);
	}

	public void setCancled(boolean cancled) {
		this.cancled = cancled;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	public void setPassage(boolean passage) {
		this.passage = passage;
	}
	
	public void setPayed(boolean payed) {
		this.payed = payed;
	}
	
	public void setPrepared(boolean prepared) {
		this.prepared = prepared;
	}

	public void setState(State state) {
		this.state = state;
	}



	
}
