package state;

import java.util.HashMap;
import java.util.Map;

public class Stock {
	private static Map<String, Integer> stock = new HashMap<String, Integer>() {
		{
			put("book", 3);
			put("shoe", 2);
			put("apple", 0);
			put("cup", 2);
		}
	};

	public static int check(String product) {
		int result = 0;
		if (stock.containsKey(product)) {
			result = stock.get(product);
			if (result > 0) {
				stock.put(product, --result);
			}
		}
		return result;
	}

	public static void cancle(String product) {
		int i = stock.get(product);
		stock.put(product, ++i);
	}

}
