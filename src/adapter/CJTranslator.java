package adapter;

public class CJTranslator implements Translator{
	private CETranslator ce; 
	public CJTranslator() {
		ce = new CETranslator();
	}
	

	@Override
	public String translate() {
		
		System.out.println("Translate from "+ce.translate()+ " to Japanese");
		return "Japanese";
		
	}

}
