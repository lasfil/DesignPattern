package bridge;

public class PhoneTranslator implements Translator{
	private Dictionary dicToEn;
	private Dictionary dicFromEn;
	
	public PhoneTranslator(Dictionary dicToEn,Dictionary dicFromEn) {
		super();
		this.dicFromEn = dicFromEn;
		this.dicToEn = dicToEn;
	}

	@Override
	public void translate() {
		System.out.println("Phone start translation from Chinese to French");

		dicToEn.translateToEn();
		dicFromEn.translateFromEn();
		
	}
	
}
