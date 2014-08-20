package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		InvocationHandler sqlHandler = new SQLHandler(SQLHQLstatement.class);
		SQLInterface sql = (SQLInterface) Proxy.newProxyInstance(
				SQLStatement.class.getClassLoader(),
				// interfaces参数可以有两种调用方法，一种是用类的getInterfaces方法
				// 一种是直接创建interface的class集合,这种方法可以传入任意接口类
				// new Class[]{SQLInterface.class, HQLInterface.class},
				SQLStatement.class.getInterfaces(), sqlHandler);
		sql.insert();
		sql.delete();

		HQLInterface statement = (HQLInterface) Proxy.newProxyInstance(
				SQLHQLstatement.class.getClassLoader(),
				// interfaces参数可以有两种调用方法，一种是用类的getInterfaces方法
				// 一种是直接创建interface的class集合,这种方法可以传入任意接口类
				new Class[]{SQLInterface.class, HQLInterface.class},
				//SQLHQLstatement.class.getInterfaces(), 
				sqlHandler);
		

		statement.update("f1", "v1");
		statement.find();
		
		((SQLInterface) statement).insert();
		((SQLInterface) statement).delete();
	}
}
