package AbstractFactory;

import AbstractFactory.employee.Dresser;
import AbstractFactory.employee.Employee;

public class MakeupRecord implements Record {
	private Dresser e;
	private MakeupProduct p;

	@Override
	public void setCommission() {
		System.out.println(e.getName() + " Sales " + p.getPrice());
	}

	@Override
	public void setEmployee(Employee e) {
		this.e = (Dresser) e;
	}

	@Override
	public void setProduct(Product p) {
		this.p = (MakeupProduct) p;
	}

}
