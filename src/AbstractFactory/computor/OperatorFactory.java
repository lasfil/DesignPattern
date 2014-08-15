package AbstractFactory.computor;

public interface OperatorFactory {
	//Operator createOperator(double num1, double num2);

	Operator createOperator(String oper);
}
