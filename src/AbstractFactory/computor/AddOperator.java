package AbstractFactory.computor;

public class AddOperator implements Operator {
	private double num1;
	private double num2;

	@Override
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	@Override
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	@Override
	public double compute() {
		return (double) (num1 + num2);
	}

}
