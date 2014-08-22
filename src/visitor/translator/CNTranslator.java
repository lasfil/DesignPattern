package visitor.translator;

public class CNTranslator implements Translator
{

	@Override
	public void translate(ENDocument edoc) {
		System.out.println("Can't translate English");
		
	}

	@Override
	public void translate(DEDocument edoc) {
		System.out.println("Can't translate German");
		
	}

	@Override
	public void translate(CNDocument edoc) {
		System.out.println("Translate Chinese");
		
	}

	@Override
	public void translate(JPDocument edoc) {
		System.out.println("translate Japanese");
		
	}

}
