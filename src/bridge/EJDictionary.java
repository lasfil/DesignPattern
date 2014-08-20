package bridge;

public class EJDictionary implements Dictionary {

	@Override
	public void translateToEn() {
		System.out.println("Tranlate Japanese to English");

	}

	@Override
	public void translateFromEn() {
		System.out.println("Tranlate English to Japanese  ");

	}

}
