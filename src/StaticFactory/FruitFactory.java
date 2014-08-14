package StaticFactory;

public class FruitFactory {
	

	public static Fruit getFruit(@SuppressWarnings("rawtypes") Class class1) {
		try {
			return (Fruit) class1.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	
}
