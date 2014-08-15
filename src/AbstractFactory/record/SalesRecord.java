package AbstractFactory.record;


public class SalesRecord implements Record {
	private Employee e;
	private Product p;
	
	protected SalesRecord(){
		
	}

	@Override
	public void setCommission() {
		System.out.println(e.getName() + " Sales " + p.getPrice());
	}

	@Override
	public void setEmployee(Employee e) {
		this.e = e;
	}

	@Override
	public void setProduct(Product p) {
		this.p = p;
	}

}
