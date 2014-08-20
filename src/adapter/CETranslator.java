package adapter;

public class CETranslator implements Translator{
	public String translate() {
		System.out.println("translate from Chinese to English");
		return "English";
	}
}
