package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SQLHandler implements InvocationHandler {
	private Object proxyObject;

	public SQLHandler(Class<?> clazz) {
		try {
			this.proxyObject = clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		System.out.println("Transaction start");
		result = method.invoke(proxyObject, args);
		System.out.println("Transaction commit");
		return result;
	}

}
