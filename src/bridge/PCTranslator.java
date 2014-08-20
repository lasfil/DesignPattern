package bridge;

public class PCTranslator implements Translator{
	private Dictionary dicToEn;
	private Dictionary dicFromEn;
	
	public PCTranslator(Dictionary dicToEn,Dictionary dicFromEn) {
		super();
		this.dicFromEn = dicFromEn;
		this.dicToEn = dicToEn;
	}

	@Override
	public void translate() {
		System.out.println("PC start translation from Chinese to Japanese");
		dicToEn.translateToEn();
		dicFromEn.translateFromEn();
		
	}
	
}
