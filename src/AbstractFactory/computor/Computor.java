package AbstractFactory.computor;

import java.util.Scanner;
import static java.lang.System.*;

public class Computor {
	public void lanch() {
		Scanner s = new Scanner(in);
		out.println("Please input the first number:");
		String sNum1 = s.nextLine();
		out.println("Please input the operator:");
		String oper = s.nextLine();
		out.println("Please input the second number:");
		String sNum2 = s.nextLine();
		
		OperatorFactory of = new ClassPathApplicationContext();
		Operator o = of.createOperator(oper);
		o.setNum1(Double.parseDouble(sNum1));
		o.setNum2(Double.parseDouble(sNum2));
		
		double result = o.compute();
		
		out.println(sNum1 + oper + sNum2 + "=" + result );
		s.close();
		
	}
}
