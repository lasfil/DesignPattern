package AbstractFactory;

public class StyleRecord implements Record {
	private Designer designer;
	private Assistant assistant;
	public Employee getAssistant() {
		return assistant;
	}

	public void setAssistant(Employee assistant) {
		this.assistant = (Assistant) assistant;
	}

	private Product p;

	@Override
	public void setCommission() {
		System.out.println(designer.getName() + " Style " + p.getPrice() + assistant.getName());
	}

	@Override
	public void setEmployee(Employee e) {
		this.designer = (Designer) e;
	}

	@Override
	public void setProduct(Product p) {
		this.p = p;
	}
	
	public Employee getEmployee() {
		return designer;
	}

}
