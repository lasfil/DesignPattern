package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FruitFactory {
	private Map<String, Fruit> pool;

	public FruitFactory() {
		pool = new HashMap<String, Fruit>();
	}

	public Fruit getFruit(String name) {
		if (!pool.containsKey(name)) {
			if (name.contains("a")) {
				pool.put(name, new Apple(name));
			}else if (name.contains("b")) {
				//香蕉作为不共享的享元类直接生成新对象并且不加入pool
				return new Banana(name);
			}else if (name.contains("p")) {
				pool.put(name, new Pear(name));
			}
		}
		return pool.get(name);

	}
}
