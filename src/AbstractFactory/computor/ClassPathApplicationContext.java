package AbstractFactory.computor;

import java.io.IOException;
import java.util.Properties;

public class ClassPathApplicationContext implements OperatorFactory{
	private Properties prop;
	
	public ClassPathApplicationContext() {
		prop = new Properties();
		try {
			prop.load(ClassPathApplicationContext.class.getClassLoader().getResourceAsStream("AbstractFactory/computor/operator.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Operator createOperator(String oper) {
		String operClass = prop.getProperty(oper);
		//System.out.println(operClass);
		Operator o = null;
		try {
			o =(Operator) Class.forName(operClass).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

}
